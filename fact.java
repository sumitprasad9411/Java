public class fact {

    static int factRes(int n){
        if (n==1) {
            return 1;
        }
          System.out.println(n);
          return n*factRes(n-1);
    }
    public static void main(String[] args) {
        int res = factRes(5);
        System.out.println("Factorial : "+res);
    }
}
