public class q15 {
    public static void main(String[] args) {
        int arr [] = {10,20,20,30,20} ; 
        int key = 20 ;
        System.out.println(count(arr,key,0,0));
    }

    public static int count(int [] arr , int key , int idx, int ans)
    {
        if(idx == arr.length)
        {
            return ans ;
        }
        if(arr[idx] == key)
        {
            ans ++ ;
        }
        return count(arr, key, idx+1, ans) ;
    }
}