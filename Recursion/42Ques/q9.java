public class q9 {
    public static void main(String[] args) {
        int n = 121 ;
        System.out.println(pall(n,0,n));
    }

    public static boolean pall(int n , int rev , int org)
    {
        if(n == 0) 
        {
            return rev == org ; 
        }
        else 
        {
            return pall(n/10 , rev*10 + (n % 10), org) ;
        }
    }
}
