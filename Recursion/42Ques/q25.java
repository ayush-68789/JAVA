public class q25 {
    public static void main(String[] args) {
        int n = 10200055 ; 
        System.out.println(remove0(n,0,0));
    }
    public static int remove0(int n, int ans, int place)
    {
        if(n == 0)
        {
            return ans ; 
        }
        int digi = n % 10 ;
        if(digi != 0)
        {
            return (remove0(n/10, ans + (int)Math.pow(10,place)*digi, place+1)) ;
        }
        else
        {
            return remove0(n/10 , ans, place) ; 
        }
    }
}
