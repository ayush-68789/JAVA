import java.util.Scanner ; 
import java.util.Arrays ;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        int num = sc.nextInt() ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == num)
            {
                System.out.printf("%d is at %d index",num,i); 
            }
        }
    }
}
