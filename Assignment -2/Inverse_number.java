import java.util.Scanner;

public class Inverse_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        sc.close();
        System.out.print(inverse(n)) ;
    }

    public static int inverse(int n )
    {
        int sum = 0 ; 
        int place = 1 ; 

        while( n > 0 )
        {
            int rem = n % 10 ; 
            sum += place * Math.pow(10,rem-1) ; 
            n = n / 10 ;
            place++; 
        }
        return sum ; 
    }
}