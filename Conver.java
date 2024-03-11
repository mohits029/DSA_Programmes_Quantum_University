import java.util.Scanner;
public class Conver {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float f= scan.nextFloat();
        double c= 5.0/9.0 * (f-32) ;
        System.out.println(c);
    }
}
