import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.printf("enter a number : ") ;
        int num = sc.nextInt() ;
        int fact = 1 ; 
        for(int i = 1 ; i <= num ; i++)
        {
            fact = fact * i ;
        }
        sc.close() ;
        System.out.printf("Factorial of %d = %d",num,fact) ;
    }
}
