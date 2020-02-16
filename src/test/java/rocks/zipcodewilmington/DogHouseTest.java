package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void addTest(){
        //given
        DogHouse.clear();
        Dog fido = new Dog(null, null, null);
        //when
        DogHouse.add(fido);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest(){
        //given
        DogHouse.clear();
        Dog fido = new Dog(null, null, 5);
        //when
        DogHouse.add(fido);
        DogHouse.remove(5);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByDogTest(){
        DogHouse.clear();
        Dog fido = new Dog(null, null, 5);
        //when
        DogHouse.add(fido);
        DogHouse.remove(fido);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        Dog fido = new Dog(null, null, 5);
        //when
        DogHouse.add(fido);
        Dog actual = DogHouse.getDogById(5);
        //then
        Assert.assertEquals(actual, fido);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected,actual);
    }
}
