package com.lambdaschool.javadogs;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogsRepository extends JpaRepository<Dog, Long> {
   List<Dog> findByBreedIgnoreCase(String breed);
   List<Dog> findByApartmentOK(Boolean apartmentOK);
}
