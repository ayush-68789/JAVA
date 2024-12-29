import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int r1 = sc.nextInt() ;
        int c1 = sc.nextInt() ;
        int arr[][] = new int [r1][c1] ;
        // input 
        for(int i  = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c1 ; j++)
            {
                arr[i][j] = sc.nextInt() ;
            }
        }
        
        // print 
        
        for (int i = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c1 ; j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
