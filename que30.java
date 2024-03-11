public class que30 {
    public static int fact(int n){
        int x=1;
        for(int i=1; i<=n; i++){
            x*= i;
        }
        return x;
    }


    public static void main(String[] args) {
        int n=4;
        int r=2;
        int nPr= fact(n)/ fact(n-r);

        int nCr= fact(n)/ (fact(r)* fact(n-r));
        System.out.println(nCr);
    }
}
