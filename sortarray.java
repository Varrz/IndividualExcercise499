import java.util.Arrays;

public class sortarray {
    
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortArray(new int[] {5,4,2,1,3})));
        System.out.println(Arrays.toString(sortArray(new String[] {"a","c","b","ab","abc"})));
    }

    public static int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static String[] sortArray(String[] array){
        Arrays.sort(array);
        return array;
    }

}
