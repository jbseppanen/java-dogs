package com.lambdaschool.javadogs;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@RequestMapping("/dogs")
public class DogsController {

    private final DogsRepository dogsRepo;
    private final DogsResourceAssembler assembler;

    public DogsController(DogsRepository dogsRepo, DogsResourceAssembler assembler) {
        this.dogsRepo = dogsRepo;
        this.assembler = assembler;
    }

    @GetMapping("/breeds")
    public Resources<Resource<Dog>> all() {
        List<Dog> dogList = dogsRepo.findAll();
        dogList.sort((e1, e2) -> e1.getBreed().compareToIgnoreCase(e2.getBreed()));
        List<Resource<Dog>> dogs = dogList.stream()
                .map(assembler::toResource)
                .collect(Collectors.toList());
        return new Resources<>(dogs, linkTo(methodOn(DogsController.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public Resource<Dog> findOne(@PathVariable Long id) {
        Dog dog = dogsRepo.findById(id)
                .orElseThrow(() -> new DogNotFoundException(id));
        return assembler.toResource(dog);
    }

    @GetMapping("/weight")
    public Resources<Resource<Dog>> weight() {
        List<Dog> dogList = dogsRepo.findAll();
        dogList.sort((e1, e2) -> e1.getWeight() - e2.getWeight());
        List<Resource<Dog>> dogs = dogList.stream()
                .map(assembler::toResource)
                .collect(Collectors.toList());
        return new Resources<>(dogs, linkTo(methodOn(DogsController.class).all()).withSelfRel());
    }

    @GetMapping("/breeds/{breed}")
    public Resources<Resource<Dog>> getBreed(@PathVariable String breed) {
        ArrayList<Dog> dogList = new ArrayList<>();
        for (Dog dog : dogsRepo.findAll()) {
            if (dog.getBreed().toLowerCase().equals(breed.toLowerCase())) {
                dogList.add(dog);
            }
        }
        List<Resource<Dog>> dogs = dogList.stream()
                .map(assembler::toResource)
                .collect(Collectors.toList());
        return new Resources<>(dogs, linkTo(methodOn(DogsController.class).all()).withSelfRel());
    }

    @GetMapping("/breeds/apartment")
    public Resources<Resource<Dog>> getApartmentDogs() {
        ArrayList<Dog> dogList = new ArrayList<>();
        for (Dog dog : dogsRepo.findAll()) {
            if (dog.isApartmentOK()) {
                dogList.add(dog);
            }
        }
        List<Resource<Dog>> dogs = dogList.stream()
                .map(assembler::toResource)
                .collect(Collectors.toList());
        return new Resources<>(dogs, linkTo(methodOn(DogsController.class).all()).withSelfRel());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateDog(@RequestBody Dog newDog, @PathVariable Long id)
            throws URISyntaxException {

        Dog dogToUpdate = dogsRepo.findById(id)
                .map(dog -> {
                    dog.setBreed(newDog.getBreed());
                    dog.setWeight(newDog.getWeight());
                    dog.setApartmentOK(newDog.isApartmentOK());
                    return dogsRepo.save(dog);
                })
                .orElseGet(() -> {
                    newDog.setId(id);
                    return dogsRepo.save(newDog);
                });

        Resource<Dog> resource = assembler.toResource(dogToUpdate);

        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    @PostMapping()
    public ResponseEntity<?> addDog(@RequestBody Dog newDog) throws URISyntaxException {
        Dog dogToAdd = new Dog(newDog.getBreed(), newDog.weight, newDog.isApartmentOK());
        dogsRepo.save(dogToAdd);

        Resource<Dog> resource = assembler.toResource(dogToAdd);
        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDog(@PathVariable Long id) {
        dogsRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("breeds/{breed}")
    public ResponseEntity<?> deleteBreed(@PathVariable String breed) {
        for (Dog dog : dogsRepo.findAll()) {
            if (dog.getBreed().toLowerCase().equals(breed.toLowerCase())) {
                dogsRepo.delete(dog);
            }
        }
        return ResponseEntity.noContent().build();
    }
}
