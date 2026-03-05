public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int arr [] = {10, 5 ,2, 6} ;
        int k = 100 ;
        System.out.println(productLESSthank(arr, k));
    }
    public static int productLESSthank(int [] arr , int  k)
    {
        int start = 0 ; 
        int end = 0 ; 
        int prod = 1 ; 
        int count = 0 ; 
        while(end < arr.length)
        {
            // grow
            prod *= arr[end] ;

            // shrink
            while(prod >= k && start <= end)
            {
                prod = prod / arr[start] ;
                start++ ;
            }

            count = count + (end - start + 1) ;
            end ++ ;
        }
        return count ;
    }
}
