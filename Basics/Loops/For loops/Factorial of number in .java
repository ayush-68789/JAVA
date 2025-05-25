#TERMINAL 
enter number : 5
Factorial : 120


    
#code
    
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter number : ");
        int n = sc.nextInt() ;
        
        int fact = 1 ; 
        for (int i = 1 ; i <= n ; i++)
        {
            fact*=i;
        }
        
        System.out.print("Factorial : "+fact);
    }
}
