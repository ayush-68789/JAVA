public class q7 {
    public static void main(String[] args) {
        int n = 456 ; 
        System.out.println(prod(n));
    }

    public static int prod(int n)
    {
        if(n == 0)
        {
            return 1 ; 
        }
        else
        {
            return prod(n/10) * (n % 10) ;
        }
    }
}
