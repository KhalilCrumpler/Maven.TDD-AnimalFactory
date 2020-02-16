package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String givenName = "Zula";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void setBirthDateTest(){
        // Given
        Cat cat = new Cat(null, null, null);
        Date birthDate = new Date();

        // when
        cat.setBirthDate(birthDate);

        // then
        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(catBirthDate, birthDate);
    }
    @Test
    public void speakTest(){
        // Given
        Cat cat = new Cat(null, null, null);
        String catPhrase = "meow!";

        // when
        String actualPhrase = cat.speak();

        // then
        Assert.assertEquals(catPhrase, actualPhrase);

    }

    @Test
    public void eatTest(){
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        Integer mealsEaten = 0;
        // when
        cat.eat(food);
        mealsEaten +=1;
        //then
        Assert.assertEquals(mealsEaten, cat.getNumberOfMealsEaten());

    }
    @Test
    public void getIdTest(){
        // Given
        Cat cat = new Cat(null, null, null);
        Integer expectedId = cat.getId();
        // when
        Integer actualId = cat.getId();
        // then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void catInstanceOfAnimal(){
        // Given
        Cat cat = new Cat(null, null, null);
        Boolean actual = cat instanceof Animal;
        //when
        Boolean expected = true;

        //then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void catInstanceOfMammal(){
        //Given
        Cat cat = new Cat(null, null, null);
        Boolean actual = cat instanceof Mammal;
        //when
        Boolean expected = true;

        //then
        Assert.assertEquals(actual, expected);
    }






}
