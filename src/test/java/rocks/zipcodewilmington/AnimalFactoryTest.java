package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

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
       String name = "Khalil";
       Date birthDate = new Date();
       Dog newDog = AnimalFactory.createDog(name, birthDate);

       // when
       newDog.setName(name);
       newDog.setBirthDate(birthDate);
       //then
       Assert.assertEquals(name, newDog.getName());
       Assert.assertEquals(birthDate, newDog.getBirthDate());

   }
   @Test
    public void createCatTest(){
       //given
       String name = "Khalil";
       Date birthDate = new Date();
       Dog newCat = AnimalFactory.createDog(name, birthDate);

       // when
       newCat.setName(name);
       newCat.setBirthDate(birthDate);
       //then
       Assert.assertEquals(name, newCat.getName());
       Assert.assertEquals(birthDate, newCat.getBirthDate());
   }



}
