import java.util.Scanner ;
class Main 
{
    static void rotate(int arr[],int n , int r) 
    {
        for(int i = 0 ; i < r ; i++)
        {
            int last = arr[n-1] ; 
            for(int j = n-1 ; j > 0 ; j--)
            {
                arr[j] = arr[j-1] ;
            }
            arr[0] = last ; 
        }
    }
    
    static void printarr(int arr[] ,int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("%d ",arr[i]) ;
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter size : ") ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        System.out.print("Enter Rotations : ");
        int r = sc.nextInt() ; 
        rotate(arr,n,r) ;
        printarr(arr,n) ;
    }
}
