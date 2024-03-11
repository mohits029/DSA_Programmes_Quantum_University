import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int arr[]= new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter "+ (i+1)+" marks : ");
            arr[i]= scan.nextInt();
            System.out.println();
        }

        float sum= 0;
        for(int i=0; i<5; i++){
            sum+= arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
