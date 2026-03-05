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
        
        int max = arr[0] ;
        int secmax = -1 ;
        for(int i = 0 ; i < n ; i++) 
        {
            if(max < arr[i])
            {
                secmax = max ;
                max = arr[i] ;
            }
            else if (max > arr[i] && secmax < arr[i] )
            {
                secmax = arr[i] ;
            }
        }
        System.out.printf("%d is sec max ",secmax);
    }
}
