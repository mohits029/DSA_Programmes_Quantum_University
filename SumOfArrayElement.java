public class SumOfArrayElement {
    public static void main(String[] args) {
        int arr[]= {12,3,3,1};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
        }

        System.out.println(sum);
    }
}
