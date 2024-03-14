public class FactorialOfElement {
    public static long fact(long x){
        long f=1;
        for(int i=1; i<=x; i++){
            f= f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        long arr[]= {4,5,2,10};
        long arr2[]= new long[arr.length];
        for(int i=0; i<arr.length; i++){
            long a= fact(arr[i]);
            arr2[i]= a;
        }

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}
