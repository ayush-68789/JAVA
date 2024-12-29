import java.util.Scanner ; 
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.printf("Enter Size : ");
        int size = sc.nextInt() ;
        int arr[] = new int [size] ;
        System.out.printf("");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt(); 
        }
    
        System.out.printf("\nEnter the number : ") ;
        int occ = sc.nextInt() ;
    
        int lastOcc = 0 ;
        for(int j = 0 ; j < size ; j++)
        {
            if(arr[j] == occ) 
            {
                lastOcc = j ;
            }
        }
    
        System.out.printf("%d last occured at index (%d)",occ,lastOcc);
    }
}
