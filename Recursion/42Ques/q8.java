public class q8 {
    public static void main(String[] args) {
        int n = 321 ; 
        System.out.println(rev(n,0));
    }

    public static int rev(int n , int sum)
    {
        if(n == 0)
        {
            return sum ;
        }
        else
        {
            return rev(n/10, sum * 10 + (n % 10)) ; 
        }
    }
}