package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addTest(){
        //given
        CatHouse.clear();
        Cat kitty = new Cat(null, null, null);
        //when
        CatHouse.add(kitty);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeId(){
        //given
        CatHouse.clear();
        Cat kitty = new Cat(null, null, 5);
        //when
        CatHouse.add(kitty);
        CatHouse.remove(5);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void removeCatTest(){
        //given
        CatHouse.clear();
        Cat kitty = new Cat(null, null, null);

        //when
        CatHouse.add(kitty);
        CatHouse.remove(kitty);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest(){
        //given
        CatHouse.clear();
        Cat kitty = new Cat("khalil", new Date(), 5);
        //when
        CatHouse.add(kitty);
        Cat actual = CatHouse.getCatById(5);
        //then
        Assert.assertEquals(actual, kitty);
    }

    @Test
    public void getNumberOfCats(){
        //given
        CatHouse.clear();
        Cat kitty = new Cat("Khalil", new Date(), 5);
        Cat kitty2 = new Cat("khalil2", new Date(), 6);
        //when
        CatHouse.add(kitty);
        CatHouse.add(kitty2);
        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected, actual);
    }

}
