public class q2 {
    public static void main(String[] args) {
        int n = 5 ; 
        pf(n) ; 
    }

    public static void pf(int n)
    {
        if(n == 0)
        {
            return ;
        }
        else
        {
            System.out.println(n);
            pf(n-1);
        }
    }
}
