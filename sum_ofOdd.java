public class sum_ofOdd {
    public static void main(String[] args) {
        int n=24453;

        int a=0;
        while (n>0) {
            a= a*10+n%10;
            n=n/10;
        }

        int i=1;
        int sum= 0;
        while (a>0) {
            if(i%2!=0){
                sum+= a%10;
            }
            a= a/10;
            i++;
        }

        System.out.print(sum);
    }
}
