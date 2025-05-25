#TERMINAL
532
10


#code

  
import java.util.Scanner;
class Main 
{
    public static void digitsum(int n)
    {
        int sum = 0 ;
        while(n>0)
        {
            sum += n % 10 ;
            n = n/10 ;
        }
        n = sum ;
        
        System.out.printf("%d",n);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digitsum(n);
    }
}
