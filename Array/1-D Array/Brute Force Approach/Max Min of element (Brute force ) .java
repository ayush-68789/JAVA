import java.util.Scanner ;
class Main 
{
    static void max(int arr[], int n)
    {
        int max = arr[0] ; 
        int min = arr[0] ;
        for(int i = 0 ; i < n ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i] ;
            }
            if(min > arr[i])
            {
                min = arr[i] ;
            }
        }
        System.out.printf("max is %d\nmin is %d",max,min);
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
