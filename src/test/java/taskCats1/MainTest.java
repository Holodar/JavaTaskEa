package taskCats1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testGenderAgeSelect(){
        // given
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Tom", "male", 2));
        cats.add(new Cat("Ron", "male", 3));
        cats.add(new Cat("Lisa", "female", 4));
        cats.add(new Cat("Rita", "female", 4));
        cats.add(new Cat("Nina", "female", 5));
        cats.add(new Cat("Tor", "male", 3));
        cats.add(new Cat("Grom", "male", 7));

        //when
        List<Cat> result = Main.genderAgeSelect(cats);

        //then
        Assert.assertNotNull("result is not null",result);
        Assert.assertEquals("Expected size is 2", 2, result.size());
    }

    @Test
    public void lineTest(){
        //given
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Tom", "male", 2));
        cats.add(new Cat("Ron", "male", 3));
        cats.add(new Cat("Lisa", "female", 4));

        //when
        String result = Main.toline(cats);

        //then

        Assert.assertNotNull("Tom, Ron, Lisa",result);
    }
}
