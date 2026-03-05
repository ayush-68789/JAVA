import java.util.ArrayList;
import java.util.List;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n = 3 ;
        List <String> ll = new ArrayList<>() ;
        pths(n , 0 , 0 , "" , ll) ;   
        System.out.println(ll);     
    }
    public static void pths(int n , int open , int close , String st , List <String> ll)
    {
        if(open == n && close == n)
        {
            // System.out.println(st);
            ll.add(st) ;
            return ;
        }
        if(open > n || close > open)
        {
            return ;
        }
        pths(n, open+1, close, st + "(", ll);
        pths(n, open, close+1, st + ")" , ll);
    }
}