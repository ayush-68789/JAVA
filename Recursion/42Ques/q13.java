public class q13 {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50} ;
        System.out.println(sumAll(arr,0));
    }

    public static int sumAll(int arr[] , int idx ) 
    {
        if(idx == arr.length)
        {
            return 0 ; 
        }
        else
        {
            return arr[idx] + sumAll(arr, idx+1) ;
        }
    }
}
