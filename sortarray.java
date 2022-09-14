import java.util.Arrays;
//import static org.junit.Assert;
//import org.junit.Test;

public class sortarray {
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortArray(new int[] {5,4,2,1,3})));
    }

    public static int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }

    

}
