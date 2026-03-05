import java.util.*;
public class Finding_CB_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
    }
    public static boolean isCBnumber(long num)
    {
        int [] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29} ;
        
        if(num == 0 || num == 1)
        {
            return false ;
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(num == arr[i])
                {
                    return true ;
                }
                if(num % arr[i] == 0)
                {
                    return false ;
                }
            }
        }
        return true ;
    }
    public static void printallsubstring(String s)
    {
        int count = 0 ;
        boolean [] visited = new boolean[s.length()] ;
        for(int len = 1 ; len <= s.length() ; len++)
        {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len ;
                long num = Long.parseLong(s.substring(i, j)) ;
                if(isCBnumber(num) && isvisited(visited, i , j-1)) ;
                {
                    count++ ;
                }
            }
        }
    }
    public static boolean isvisited(boolean [] visited, int i , int j)
    {
        for (int k = 0; k < j ; k++) {
            if(visited[k] == true)
            {
                return false ;
            }
        }
        return true ;
        
    }
}
