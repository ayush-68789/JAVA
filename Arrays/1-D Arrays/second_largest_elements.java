public class second_largest_elements
{
    public static void main(String[] args) {
        int[] arr = {1,5,42,2,6,8,5} ;
        int res = seclarge(arr) ; 
        System.out.println(res);
    }
    public static int seclarge(int []arr)
    {
        int max1 = Integer.MIN_VALUE ; 
        int max2 = Integer.MIN_VALUE ;
        int max3 = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max1 < arr[i])
            {
                max3 = max2 ; 
                max2 = max1 ; 
                max1 = arr[i] ; 
            }
            else if(max2 < arr[i])
            {
                max3 = max2 ; 
                max2 = arr[i] ; 
            }
            else if(max3 < arr[i])
            {
                max3 = arr[i] ; 
            }
        }

        return max3 ; 
    }
}