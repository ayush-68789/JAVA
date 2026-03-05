public class q1 {
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
            pf(n-1);
            System.out.println(n);
        }
    }
}
