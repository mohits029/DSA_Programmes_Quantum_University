public class Pattern53 {
    public static void main(String[] args) {
        int n=5;

        for(int i=n; i>=1; i--){
            for(int j= n; j>=1; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
