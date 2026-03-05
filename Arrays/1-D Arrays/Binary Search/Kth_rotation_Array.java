public class Kth_rotation_Array
{
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3} ;
        System.out.println(rotation(arr));
    }

    public static int rotation(int [] arr)
    {
        // to find out the rotation just find the min element as where it will be the array is rotated that times 
        // [3,4,5,1,2] its rotated 3 times and the index of the min is 3  
        int low = 0;
        int high = arr.length-1 ;
        int ans = Integer.MAX_VALUE;
        int idx = -1 ; 
        while(low<= high)
        {
            int mid = (low + high) / 2 ;
            if(arr[low] <= arr[mid])
            {
                if(arr[low] < ans)  // find the minimum and update then store the index
                {
                    ans = arr[low] ;
                    idx = low ;
                }
                low = mid + 1 ; 
            }
            else if(arr[mid] <= arr[high])
            {
                if(arr[mid] < ans)
                {
                    ans = arr[mid] ; 
                    idx = mid ;
                }
                high = mid - 1 ;
            }
        }
        return idx ;   
    }
}