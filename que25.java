public class que25 {
    public static void main(String[] args) {
        int n= 8979;
        StringBuilder bin= new StringBuilder("");
        // boolean flag= true;
        while (n>0) {
            int a= n/2;
            int r= n- a*2;
            bin.append(r);
            n= n/2;
        }
        System.out.println(bin.reverse());
    }
}
