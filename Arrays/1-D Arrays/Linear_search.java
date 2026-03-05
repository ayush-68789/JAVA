public class Linear_search
{
    public static void main(String args[]){
        int arr[] = {10, 3 , 4 , 6 , 7 , 9} ;
        int target = 6 ; 
        int res = search(arr, target) ; 
        System.out.println(res);
    }

    public static int search(int arr[] , int n)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == n)
            {
                return i ; 
            }
        }
        return -1 ;
    }
}