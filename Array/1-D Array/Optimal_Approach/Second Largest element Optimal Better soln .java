import java.util.Scanner ; 
class Main 
{
    static void secMax(int arr[] ,int n )
    {
        int largest = arr[0] ; 
        int slargest = -1 ; 
        for(int i = 1 ; i < n ; i++)
        {
            if (arr[i] > largest)
            {
                slargest = largest ; 
                largest = arr[i] ;
            }
            else if (arr[i] < largest && arr[i] > slargest)
            {
                slargest = arr[i] ;
            }
        }
        System.out.printf("Second largest : %d",slargest) ; 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter Size : ");
        int n = sc.nextInt() ;
        int arr[] = new int [n] ;
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        secMax(arr,n) ;
    }
}
