public class Kth_Root {
    public static void main(String[] args) {
        int n = 27 ; 
        int bad = 3 ; 
        System.out.println(kthROOT(n, bad));
    }

    public static int kthROOT(int n , int k)
    {
        int low = 1 ; 
        int high = n ; 
        while(low <= high)
        {
            int mid = low + (high- low) /2 ;   // for overflow
            long root = (long) Math.pow(mid , k) ;
            
            if(root == n )
            {
                return mid ;
            }
            
            else if(root > n)
            {
                high = mid - 1 ;
            }
            else{
                low = mid + 1 ;
            }
        }
        return -1;
    }
}
