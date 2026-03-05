public class q12 {
    public static void main(String[] args) {
        int [] arr = {10,50,8000,5,1000} ;
        System.out.println(mini(arr, 0, Integer.MAX_VALUE));
    }

    public static int mini(int [] arr , int idx , int min)
    {
        if(idx == arr.length)
        {
            return min ; 
        }
        else
        {
            min = Math.min(min, arr[idx]) ;
            return mini(arr, idx + 1, min) ;
        }
    } 
}
