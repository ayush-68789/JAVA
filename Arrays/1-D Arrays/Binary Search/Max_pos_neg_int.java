public class Max_pos_neg_int
{
    public static void main(String[] args) {
        int [] arr = {-3,-2,-1,0,0,1,2};
        int posindex = firstposindex(arr) ;
        int negindex = lastnegindex(arr) ;
        System.out.println(posindex);
    }
    public static int firstposindex(int [] arr)
    {
        int low = 0 ; 
        int high = arr.length-1 ;
        int ans = 0 ;
        while(low <= high)
        {
            int mid = (low + high) / 2 ;
            if(arr[mid] < 0)
            {
                low = mid + 1 ;
                ans = low ;
            }
            else{
                high = mid - 1 ;
            }
        }
        return ans ;
    }

    public static int lastnegindex(int [] arr)
    {
        int low = 0 ;
        int high = arr.length-1 ;
        int ans = 0 ;
        while (low <= high) 
        {
            int mid = (low+ high) /2 ;
            if(arr[mid] > 0)
            {
                high = mid - 1 ; 
                ans = high ;
            }    
            else if(arr[mid] < 0)
            {
                low = mid + 1 ;
            }
        } 
        return ans ;
    }
}