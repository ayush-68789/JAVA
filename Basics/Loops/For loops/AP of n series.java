import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt() ;
        int sum = 0 ;
        for(int i = 1 ; i <= 2*n-1 ; i+=2)      // last term of ap is 2n-1
        {
            System.out.println(sum+i) ;
        }
    }
}
