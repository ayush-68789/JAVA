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
        
        Arrays.sort(arr) ;
        
        int firstmax = arr[n-1] ;
        for(int i = n-2 ; i >= 0 ; i--)
        {
            if(arr[i] < firstmax)
            {
                System.out.printf("%d is second max",arr[i]);
                break ;
            }
        }
    }
}
