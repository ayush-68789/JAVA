import java.util.Scanner ;
class Main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in) ;
        int line = sc.nextInt() ;
        for (int i = 1 ; i <= line ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ") ;
            }
            System.out.print("\n") ;
        }
    }
}
