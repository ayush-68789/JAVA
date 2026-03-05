public class q5 {
    public static void main(String[] args) {
        int n = 123 ;
        System.out.println(sumdigi(n)); 
    }

    public static int sumdigi(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        else
        {
            return sumdigi(n/10) + n % 10  ; 
        }
    }
}