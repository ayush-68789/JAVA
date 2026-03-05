import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.nextLine() ;
        
        if(str.contains("  "))
        {
            System.out.println("Contains DOUBLE SPACE") ;
        }
        else if(str.contains("   "))
        {
            System.out.println("Contains TRIPLE SPACE");
        }
        else if(str.contains(" "))
        {
            System.out.println(str);
        }
    }
}
