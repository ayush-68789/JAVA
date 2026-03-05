import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        String replace = str.replace(" ","_") ;
        System.out.print(replace) ;
        sc.close() ;
    }
}
