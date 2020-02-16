package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

   @Test
    public void createDogTest(){
      //given
      Dog newDog = new Dog(null, null, null);
      String nameGiven = "Khalil";

      //When
      newDog.setName(nameGiven);

      //then
      String dogName = newDog.getName();
      Assert.assertEquals(dogName, nameGiven);

   }
   @Test
    public void createCatTest(){
       //Given
       String givenName = "Khalil";
       Date newBirthDate = new Date();
       Integer newId = 0;
       //when
       Cat newCat = new Cat(givenName, newBirthDate, newId);

       // when
       String catName = newCat.getName();
       Date outputBirthDate = newCat.getBirthDate();
       Integer outputId = newCat.getId();
       //then
       Assert.assertEquals(catName, givenName);
       Assert.assertEquals(outputBirthDate, newBirthDate);
       Assert.assertEquals(outputId, newId);

   }



}
