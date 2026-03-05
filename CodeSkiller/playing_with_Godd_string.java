import java.util.Scanner;

public class playing_with_Godd_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        int count = 0 ; 
        int ans = 0 ;
        for(int i = 0 ; i < str.length() ; i++)   
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++ ;
                ans = Math.max(count,ans) ; // its like kadanes algo 
            } 
            else{
                count = 0 ; 
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
