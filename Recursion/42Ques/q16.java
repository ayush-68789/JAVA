public class q16 {
    public static void main(String[] args) {
        int arr [] = {10,20,20,30,20} ; 
        int key = 30 ;
        System.out.println(count_first(arr,key,0));
    }

    public static int count_first(int [] arr , int key , int idx)
    {
        if(idx == arr.length)  // if element is not present
        {
            return -1 ; 
        }
        if(arr[idx] == key)
        {
            return idx ;
        }
        return count_first(arr, key, idx+1) ;
    }
}
