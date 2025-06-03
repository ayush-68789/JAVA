import java.util.Scanner ; 
class Main 
{
    public static void sum(int a , int b )
    {
        int c = a + b ; 
        System.out.printf("Sum : %d",c);
    }
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        sum(a,b) ;
        sc.close() ;
    }
}
