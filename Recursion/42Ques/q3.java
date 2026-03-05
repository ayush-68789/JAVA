public class q3 {
    public static void main(String[] args) {
        int n = 6 ; 
        System.out.println(sum(n)) ;
    }

    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        else
        {
            int s = sum(n-1) + n  ;
            return s ;
        }
    }
}
