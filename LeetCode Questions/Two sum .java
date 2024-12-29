import java.util.Scanner ;
class Main 
{
    static void twoSum(int arr[] ,int n, int target, int result[]) 
    { 
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n-1 ; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    result[0] = i ;
                    result[1] = j ;
                    return ;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int [n] ;
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        System.out.printf("Enter target : ") ;
        int target = sc.nextInt() ;
        int result [] = new int [2] ;
        twoSum(arr,n,target,result) ;
        if(result[0]!= 0 || result[1] != 0)
        {
            System.out.printf("[%d , %d]",result[0],result[1]);
        }
        else
        {
            System.out.printf("No such pair found");    
        }
    }
}
