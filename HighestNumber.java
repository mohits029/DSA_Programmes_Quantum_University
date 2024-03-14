import java.util.Arrays;
public class HighestNumber {
    public static void main(String[] args) {

        int arr[]= {5,4,3,6,7};
        int max_val= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max_val = Math.max(max_val, arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);


    }
}
