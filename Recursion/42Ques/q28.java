public class q28 {
    public static void main(String[] args) {
        int n = 8 ; 
        System.out.println(deci_Bin(n , 0));
    }
    public static int deci_Bin(int n, int place)
    {
        if(n == 0)
        {
            return 0 ;
        }
        else
        {
            return (int)Math.pow(10, place)*(n % 2) +  deci_Bin(n/2, place+1) ;
        }
    }
}
