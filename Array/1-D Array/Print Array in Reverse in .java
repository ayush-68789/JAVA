import java.util.Scanner ; 
class Main 
{
    static void printArr(int arr[], int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("%d ",arr[n-i-1]);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        
        printArr(arr,n) ;
    }
}
