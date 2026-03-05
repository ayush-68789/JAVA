public class q27 {
    public static void main(String[] args) {
        int n = 987 ; 
        System.out.println(digiRoot(n));
    }
    public static int digiRoot(int n)
    {
        if(n / 10 == 0)
        {
            return n ;
        }
        else
        {
            int digi = n % 10 ;
            return digi + digiRoot(n/10) ;
        }
    }
}
