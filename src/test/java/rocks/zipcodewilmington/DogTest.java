package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        Dog newDog = new Dog(null, null, null);
        Date birthDate = new Date();
        //When
        newDog.setBirthDate(birthDate);
        //Then
        Date dogBirthDate = newDog.getBirthDate();
        Assert.assertEquals(dogBirthDate, birthDate);

    }

    @Test
    public void speakTest(){
        //Given
        Dog newDog = new Dog(null, null, null);
        String bark = "bark!";
        //when
        String actualBark = newDog.speak();
        //then
        Assert.assertEquals(bark, actualBark);

    }
    @Test
    public void eatTest(){
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        Integer mealsEaten = 0;
        // when
        dog.eat(food);
        mealsEaten +=1;
        //then
        Assert.assertEquals(mealsEaten, dog.getNumberOfMealsEaten());

    }

    @Test
    public void getIdTest(){
        // Given
        Dog dog = new Dog(null, null, null);
        Integer expectedId = dog.getId();
        // when
        Integer actualId = dog.getId();
        // then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void dogInstanceOfAnimal(){
        // Given
        Dog dog = new Dog(null, null, null);
        Boolean actual = dog instanceof Animal;
        //when
        Boolean expected = true;

        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void dogInstanceOfMammal(){
        //Given
        Dog dog = new Dog(null, null, null);
        Boolean actual = dog instanceof Mammal;
        //when
        Boolean expected = true;

        //then
        Assert.assertEquals(actual, expected);
    }
}
