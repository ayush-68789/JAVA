public class maxSUM_window_sizeK
{
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,7,1,8,2,3,4} ;
        int k = 3 ;
        System.out.println(maxSUM_window(arr, k));
    }

    public static int maxSUM_window(int [] arr , int k)
    {
        int ans = 0 ; 
        int sum = 0 ;
        // pehli window ka sum  
        for(int i = 0 ; i < k ; i++)
        {
            sum += arr[i] ; 
        } 
        ans = sum ;
        for(int i = k ; i < arr.length ; i++)
        {
            sum += arr[i] ; // window grow
            sum = sum - arr[i-k] ;   // window shrink 
            ans = Math.max(ans, sum) ;  // update maxsum
        }
        return ans ;
    }
}