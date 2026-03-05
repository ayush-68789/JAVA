public class q19 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6} ;
        System.out.println(even(arr, 0 )) ;
    }

    public static int even(int [] arr , int idx)
    {
        if(idx == arr.length )
        {
            return 0 ; 
        }
        if(arr[idx] % 2 == 0)
        {
            return 1 + even(arr, idx+1) ; 
        }
        return even(arr, idx+1) ;
    }
}
