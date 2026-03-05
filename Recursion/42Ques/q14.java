public class q14 {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50} ;
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int [] arr , int idx)
    {
        if(idx == arr.length-1)
        {
            return true ; 
        }
        if(arr[idx] > arr[idx+1])
        {
            return false ;
        }
        else
        {
            return isSorted(arr, idx+1) ;
        }
    }
}
