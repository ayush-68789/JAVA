public class q17 {
    public static void main(String[] args) {
        int arr [] = {10,20,20,30,50} ; 
        int key = 20 ;
        System.out.println(count_last(arr,key,arr.length-1));
    }

    public static int count_last(int [] arr , int key , int idx)
    {
        if(idx == -1)  // if element is not present
        {
            return -1 ; 
        }
        if(arr[idx] == key)
        {
            return idx ;
        }
        return count_last(arr, key, idx-1) ;
    }
}
