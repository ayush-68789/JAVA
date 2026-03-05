public class q24 {
    public static void main(String[] args) {
        int n = 1234 ; 
        System.out.println(count(n));
    }

    public static int count(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        if((n % 10) % 2 == 0)
        {
            return (n%10) + count(n/10 ) ; 
        }
        else
        {
            return count(n/10) ; 
        }
    }
}
