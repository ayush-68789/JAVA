import java.util.Scanner ;
class Main 
{
    static void max(int arr[], int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j] ; 
                    arr[j] = arr[j+1] ; 
                    arr[j+1] = temp ; 
                }
            }
        }
        System.out.printf("Max is %d\nMin is %d",arr[0],arr[n-1]) ;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt() ;
        int arr[] = new int [n] ;
        for (int i = 0 ; i < n ; i++ )
        {
            arr[i] = sc.nextInt() ;
        }
        max(arr,n) ;
    }
}
