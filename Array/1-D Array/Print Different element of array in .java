import java.util.Scanner;
class Main 
{
    static void diff_elem(int arr[] ,int n )
    {
        for (int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1 ;
                    arr[j] = -1 ;
                }
            }
        }
        int ans = -1 ; 
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] > 0)
            {
                ans = arr[i] ;
            }
        }
        System.out.printf("Unique element : %d",ans);
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int [n] ;
        // input 
        for(int i  = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        
        diff_elem(arr,n) ;
    }
}
