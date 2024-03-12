public class Pattern56 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j= n-1; j>=0; j--){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
