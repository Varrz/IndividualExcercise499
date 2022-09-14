import org.junit.Assert;
import org.junit.Test;

public class sortArrayStringTest {
    
    @Test
    public void testStringSort1(){
        String[] stringarray = {"a","c","b","ab","abc"};
        Assert.assertArrayEquals(new String[] {"a","ab","abc","b","c"}, sortarray.sortArray(stringarray));
    }

    @Test
    public void testStringSort2(){
        String[] stringarray = {"Bananas","Banter","Batter","Chile","Cold","Air Fryer","Air Canada"};
        Assert.assertArrayEquals(new String[] {"Air Canada","Air Fryer","Bananas","Banter","Batter","Chile","Cold"}, sortarray.sortArray(stringarray));
    }

}
