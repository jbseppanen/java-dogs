package com.lambdaschool.javadogs;

public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException(Long id) {
        super("Dog not found " + id);
    }
}
