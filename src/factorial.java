public class factorial {
    static int n ;
  static int fact(int n){
       if(n==1){
           return 1;
       }
       else {
           return (n*fact(n-1));
       }
   }

    public static void main(String[] args) {
        n = 4;
        int fact1 = 1;
        fact1 = fact(n);
        System.out.println(fact1);
    }
}
