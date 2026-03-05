public class q23 {
    public static void main(String[] args) {
        int a = 4 ; 
        int b = 6 ; 
        System.out.println((a*b)/gcd(a,b));
    }

    public static int gcd(int a , int b)
    {
        if(b == 0)
        {
            return a ;
        }
        else
        {
            return gcd(b , a%b) ;
        }
    }
}
