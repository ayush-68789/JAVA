public class Array_max_value {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,89,4,11,40,51,1,15} ;
        System.out.println(maximum(arr)) ;
    }

    public static int maximum(int arr[])
    {
        int max = Integer.MIN_VALUE; 
        for(int i = 0 ; i < arr.length ; i++)
        {
            max = Math.max(max , arr[i]) ;
        }
        return max ; 
    }
}
