import java.util.Scanner ; 
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        String letter = "Dear <name> , Thanks a lot" ;
        System.out.println(letter);
        
        System.out.print("Enter String : ");
        String str = sc.nextLine() ;
        
        String new_str = letter.replace("<name>",str) ;
        System.out.printf(new_str) ;
    }
}
