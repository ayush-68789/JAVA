public class q26 {
    public static void main(String[] args) {
        int n = 10020 ; 
        System.out.println(count0(n));
    }

    public static int count0(int n)
    {
        if(n == 0)
        {
            return 0 ; 
        }
        int digi = n % 10 ; 
        if(digi == 0)
        {
            return 1 + count0(n/10) ;
        }
        else
        {
            return count0(n/10) ;
        }
    }
}
