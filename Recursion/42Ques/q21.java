public class q21 {
    public static void main(String[] args) {
        int n = 7 ;
        System.out.println(checkprime(n,2));
    }

    public static boolean checkprime(int n , int i )
    {
        if(n == i)
        {
            return true ;
        }
        if(n % i == 0)
        {
            return false ;
        }
        else
        {
            return checkprime(n, i+1) ;
        }
    }
}
