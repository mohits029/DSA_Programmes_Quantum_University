public class RevrseOfArray {
    public static void main(String[] args) {
        int arr[]= {3,5,7,9,10};
        int sp= 0;
        int ep= arr.length-1;

        while (sp<ep) {
            int temp= arr[ep];
            arr[ep]= arr[sp];
            arr[sp]= temp;

            sp++;
            ep--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
