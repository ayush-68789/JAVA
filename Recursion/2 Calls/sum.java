public class sum {
    public static void main(String[] args) {
        int n = 3 ; 
        System.out.println(fun(n));
    }
    public static int fun(int n )
    {
        if(n <= 0)
        {
            return 0 ; 
        }
        return n + fun(n-1) + fun(n-2) ;
    }
}