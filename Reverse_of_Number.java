public class Reverse_of_Number {
    public static void main(String[] args) {
        int n= 12453;
        while (n>0) {
            int a= n%10;
            System.out.print(a);
            n= n/10;
        }
    }
}
