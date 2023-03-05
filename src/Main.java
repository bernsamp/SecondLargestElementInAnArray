import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        int[] arr = {10, 20, 25, 63, 96, 57, 88, 37, 101};
        int size = arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        int result = arr[size-2];
        System.out.println("The second largest element is: " + result);
    }
}