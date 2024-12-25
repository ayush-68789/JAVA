import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("ENter number : ");
        int n = sc.nextInt() ;
        int count = 0 ; 
        while(n!=0)
        {
            n = n/10 ;
            count++;
        }
        
        System.out.println(count+" digits") ;
    }
}
