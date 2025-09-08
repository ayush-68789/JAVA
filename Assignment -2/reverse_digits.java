import java.util.Scanner;

public class reverse_digits 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        sc.close() ;
        System.out.println(reverse(n));
    }    

    public static int count(int n )
    {
        int count = 0 ;
        while(n > 0)
        {
            n/=10;
            count++ ;
        }
        return count ;
    }

    public static int reverse(int n )
    {
        int c = count(n); 
        int rev = 0;
        while(n > 0)
        {
            int rem = n % 10 ;
            rev += rem*(Math.pow(10, c-1) );
            c -- ; 
            n /= 10 ; 
        }
        return rev ;

    }
}
