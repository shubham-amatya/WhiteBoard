import org.junit.Assert;
import org.junit.Test;



public class CountDuplicatesInAnArrayTest {

    @Test
    public void countDuplicatesTest(){
        CountDuplicatesInAnArray ar = new CountDuplicatesInAnArray();
        int [] array = {1, 2, 3, 2, 1, 4};
        int given = 2;
        int expected = ar.countDuplicates(array);
        Assert.assertEquals(given, expected);
    }

}