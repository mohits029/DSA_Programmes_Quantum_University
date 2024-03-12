public class Pattern55 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<= n; j++){
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
    }
}
