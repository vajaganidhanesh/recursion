public class recursion {
    public static void main(String[] args) {
        print1(1);
    }
//    function calls itself is called recursion
    static void print1(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print1(n+1);
    }
}
