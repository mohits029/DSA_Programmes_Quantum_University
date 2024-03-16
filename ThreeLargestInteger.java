import java.util.Arrays;
public class ThreeLargestInteger {
    public static void main(String[] args) {
        int arr1[]= {12,4,32,4,2,2,5,5,2,67};
        Arrays.sort(arr1);
        for(int i= arr1.length-3; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
