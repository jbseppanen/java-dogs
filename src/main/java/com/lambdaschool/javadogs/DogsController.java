package com.lambdaschool.javadogs;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
