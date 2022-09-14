import org.junit.Assert;
import org.junit.Test;

public class sortarrayIntTest{

    @Test
    public void testIntSort1(){
        int[] intarray = {5,3,4,1,2};
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, sortarray.sortArray(intarray));
    }

    @Test
    public void testIntSort2(){
        int[] intarray = {99,22,44,55,456};
        Assert.assertArrayEquals(new int[] {22,44,55,99,456}, sortarray.sortArray(intarray));
    }

}