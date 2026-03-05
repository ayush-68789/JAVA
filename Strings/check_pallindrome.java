import java.util.Scanner;

public class check_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        System.out.println(ispallin(s));
    }
    public static boolean ispallin(String s)
    {
        int i = 0 ; 
        int j = s.length()-1 ; 
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
}
