import java.util.Scanner ;
class Main 
{
    
    static void secMin(int arr[] ,int n )
    {
        int smallest = arr[0] ;
        int ssmallest = Integer.MAX_VALUE ;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] < smallest)
            {
                ssmallest = smallest ;
                smallest = arr[i] ;
            }
            else if (arr[i] != smallest && arr[i] < ssmallest)
            {
                ssmallest = arr[i] ;
            }
        }
        System.out.printf("Second Smallest : %d", ssmallest);
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
