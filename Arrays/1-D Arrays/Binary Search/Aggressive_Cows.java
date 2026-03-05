import java.util.Arrays;

public class Aggressive_Cows
{
    public static void main(String[] args) {
        int[] stall = {1,2,4,8,9} ;
        int cows = 3 ; 
        Arrays.sort(stall);
        System.out.print(max_Distance(stall, cows)) ;
    }

    public static int max_Distance(int[] stall , int cows)
    {
        int ans = 0 ;
        int n = stall.length ;
        int low = 0 ; 
        int high = stall[n-1] - stall[0] ;       // 9 - 1 
        while (low <= high) 
        {
            int mid = (low + high) / 2 ; 
            if(is_possible(stall , cows , mid))
            {
                ans = mid ; 
                low = mid + 1 ;
            }    
            else
            {
                high = mid - 1 ;
            }
        }
        return ans ; 
    }

    public static boolean is_possible(int[] stall , int cows , int mid)
    {
        int num_cow = 1 ; 
        int pos = stall[0] ; 
        for(int i = 1 ; i < stall.length ; i++)
        {
            if(stall[i] - pos >= mid)
            {
                num_cow++ ;
                pos = stall[i] ;
            }
            if(cows == num_cow)
            {
                return true; 
            }
        }
        return false ;
    }
}