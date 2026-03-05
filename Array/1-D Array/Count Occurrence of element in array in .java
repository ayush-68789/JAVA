import java.util.Scanner ; 
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter size : ");
        int size = sc.nextInt() ;
        int arr[] = new int[size] ;
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        System.out.print("\nEnter the number : ") ;
        int occ = sc.nextInt() ;
        int count = 0 ; 
        for(int j = 0 ; j < size ; j++)
        {
            if(arr[j] == occ)
            {
                count++ ;
            }
        }
        
        System.out.printf("%d comes %d times",occ,count);
    }
}
