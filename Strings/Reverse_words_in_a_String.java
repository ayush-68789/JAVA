import java.util.Scanner;

public class Reverse_words_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.nextLine() ; 
        str = str.trim() ;
        String[] strarray = str.split(" +") ;

        String newstr = "" ;
        for(int i = strarray.length - 1 ; i >= 0 ; i--)
        {
            newstr += strarray[i] +" " ;
        }
        System.out.print(newstr);
    }   
}
