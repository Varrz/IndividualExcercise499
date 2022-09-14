import org.junit.Assert;
import org.junit.Test;

public class sortarrayIntTest{

    @Test
    public void testIntSort1(){
        int[] intarray = {5,3,4,1,2};
        sortarray sortArrayClass = new sortarray();
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, sortArrayClass.sortArray(intarray));
    }

    @Test
    public void testIntSort2(){
        int[] intarray = {99,22,44,55,456};
        sortarray sortArrayClass = new sortarray();
        Assert.assertArrayEquals(new int[] {22,44,55,99,456}, sortArrayClass.sortArray(intarray));
    }

}