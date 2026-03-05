import java.util.Scanner ;
class Main 
{
    
    static void secMin(int arr[] ,int n )
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j] ; 
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        System.out.printf("Second Smallest : %d", arr[1]);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter Size : ");
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        secMin(arr,n) ;
    }
}
