public class q11 {
    public static void main(String[] args) {
        int [] arr = {10,50,8000,50,1000} ;
        System.out.println(maxi(arr, 0, Integer.MIN_VALUE));
    }

    public static int maxi(int [] arr , int idx , int max)
    {
        if(idx == arr.length)
        {
            return max ; 
        }
        else
        {
            max = Math.max(max, arr[idx]) ;
            return maxi(arr, idx + 1, max) ;
        }
    } 
}
