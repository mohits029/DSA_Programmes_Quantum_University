public class SumofEvenNum {
    public static void main(String[] args) {
        int arr[]= {5,3,6,7,8,5};
        int sum_of_Even= 0;
        int sum_of_Odd= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2== 0){
                sum_of_Even = sum_of_Even+arr[i];
            }
            if(arr[i]%2 != 0){
                sum_of_Odd+= arr[i];
            }
    
        }
        System.out.println(sum_of_Even);
        System.out.println(sum_of_Odd);
    }
}
