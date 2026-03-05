import java.util.Scanner ;
class Main
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in) ;
        int num1 = sc.nextInt() ;
        int num2 = sc.nextInt() ;
        int max = 0 ;
        int gcd = 0 ; 
        if (num1 > num2)
        {
            max = num1 ;
        }
        else if (num1 < num2)
        {
            max = num2 ; 
        }
        
        for (int i = 1 ; i <= max ; i++)
        {
            if ((num1 % i == 0 ) && (num2 % i == 0))
            {
                gcd = i ; 
            }
        }
        System.out.printf("%d",gcd);
    }
}
