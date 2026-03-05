import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        float arr[] = new float[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextFloat() ;
        }
        
        float sum = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i] ; 
        }
        
        System.out.printf("Sum is %f",sum) ;
    }
}
