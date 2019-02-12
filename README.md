# Project RESTDogs

# Introduction
Develop a simple REST Web application to work with data about dogs
Dogs have an auto generated id, breed name, average weight, boolean that true if the breed of dog is appropriate for apartment living otherwise false.

# Instructions
Create a Java RESTful API Web application using Web, DevTools, H2, hateoas, and Jackson and JPA.  

Seed the data with the following  

new Dogs("Springer", 50, false);  
new Dogs("Bulldog", 50, true);  
new Dogs("Collie", 50, false);  
new Dogs("Boston Terrie", 35, true);  
new Dogs("Corgie", 35, true);  

Expose the following endpoints

### Get

/dogs/breeds -> returns a listing of all dogs ordered by breed   
/dogs/weight -> returns a listing of all dogs ordered by average weight  
/dogs/breeds/{breed} -> returns dogs of just that breed  
/dogs/apartment -> returns dogs suitable for apartments    

### Put

/dogs/{id} -> adds or update if already present the dog with id value id  

### Post  

/dogs -> adds the dog

### Delete

/dogs/{id} -> deletes the dog with that id

## Stretch goal and not necessary for MVP  

Delete  

/dogs/{breed} -> deletes that dog breed

Throughout the project, when adding dogs make sure the breed names are unique
