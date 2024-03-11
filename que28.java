public class que28 {
    public static void main(String[] args) {
        int n= 21;

        boolean flag= false;
        int i=2;
        while (i<n) {
            if(n%i==0){
                flag= true;
                break;
            }
            i++;
        }
        if(flag){
            System.out.println("Not a prime number");
        }else{
            System.out.println("Prime number");
        }
    }
}
