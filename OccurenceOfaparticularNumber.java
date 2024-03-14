import java.util.Scanner;
import java.util.Arrays;
public class OccurenceOfaparticularNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,3,3,3,3,3,3,3,0};
        
    
       Arrays.sort(arr);
       int count[]= new int[arr[arr.length-1]+1];
       for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
       }

       for(int i=0; i<count.length; i++){
        System.out.println(i+" = "+count[i]);
       }

    }
}
