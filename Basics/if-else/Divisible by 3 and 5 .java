import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter number : ") ;
        int num = sc.nextInt() ;
        sc.close() ;
        if ((num % 5 == 0) && (num % 3 == 0)) 
        {
            System.out.println("Divisible by 3 and 5 ");
        }
        else if (num % 5 == 0)
        {
            System.out.println("NOT DIVISIBLE by 3 BUT DIVISIBLE BY 5");    
        }
        else if (num % 3 == 0)
        {
            System.out.println("NOT DIVISIBLE by 5 BUT DIVISIBLE BY 3") ; 
        }
    }
}
