public class CheckPrime {
    public static boolean isPrime(int x){
        boolean flag= true;
        for(int i=2; i<x; i++){
            if(x%i==0){
                flag= false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] ={2,7,9,3,5,7,8,9,10};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" = "+ isPrime(arr[i]));
        }
    }
}
