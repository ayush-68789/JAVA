import java.util.Scanner ; 
import java.util.Arrays ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        
        int max = arr[n-1] ;
        int secmax = -1 ;
        for (int i = 0 ; i < n ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i] ;
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            if((arr[i] != max) && (arr[i] > secmax))
            {
                secmax = arr[i] ; 
            }
        }
        System.out.printf("%d sec max ",secmax);
    }
}
