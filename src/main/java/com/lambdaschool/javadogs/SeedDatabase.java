package com.lambdaschool.javadogs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SeedDatabase {

    @Bean
    public CommandLineRunner initDb(DogsRepository dogsRepo) {
        return args -> {
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 50, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 50, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 50, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrie", 35, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 35, true)));


            //Add Mockaroo.com data
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 92, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 194, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 14, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 14, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 31, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 128, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 141, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 143, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 20, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 132, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 132, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 107, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 70, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 191, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 45, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 126, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 179, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 23, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 48, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 105, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 142, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 27, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 80, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 153, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 92, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 32, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 111, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 111, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 117, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 137, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 166, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 40, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 163, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 152, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 62, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 117, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 124, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 165, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 197, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 153, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 112, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 19, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 140, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 183, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 37, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 117, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 163, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 172, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 34, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 198, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 156, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 70, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 179, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 183, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 187, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 169, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 104, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 62, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 42, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 46, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 107, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 163, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 85, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 158, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 137, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 132, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 70, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 81, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 48, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 168, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 66, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 61, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 60, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 136, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 181, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 125, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 112, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 45, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 141, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 193, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 42, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 41, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 12, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 179, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 20, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 115, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 91, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Bulldog", 87, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 51, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 182, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 19, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("German Shepherd", 31, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 20, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Collie", 37, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Labrador", 44, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Corgie", 130, false)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 80, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Beagle", 63, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Boston Terrier", 29, true)));
            log.info("Seeding " + dogsRepo.save(new Dog("Springer", 114, false)));
        };
    }
}