import java.util.Scanner;
public class Seasion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Month: ");
        int m= sc.nextInt();
        if(m>=10 && m<=12 || m==1){
            System.out.println("SUMMER");
        }
        else if(m>= 2 && m<=5){
            System.out.println("SPRING");
        }
        else if(m>=6 && m<=9){
            System.out.println("RAINING");
        }
        else{
            System.out.println("default");
        }
    }
}
