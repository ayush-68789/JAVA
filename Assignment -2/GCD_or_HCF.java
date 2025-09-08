import java.util.Scanner;

public class GCD_or_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int num1 = sc.nextInt() ; 
        int num2 = sc.nextInt() ;
        System.out.println(hcf_gcd(num1 , num2));
        sc.close();
    }

    public static int hcf_gcd(int divisor, int dividend)
    {
        while(dividend % divisor != 0)
        {
            int rem = dividend % divisor ;
            dividend = divisor ; 
            divisor = rem ; 
        }
        return divisor ; 
    }
}
