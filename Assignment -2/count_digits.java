import java.util.*;
public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int target = sc.nextInt() ;
        sc.close();
        System.out.println(count(n, target));
    }

    public static int count(int n, int target )
    {
        int count = 0 ; 
        while(n > 0)
        
        {
            int rem = n % 10 ; 
            n /=10 ; 
            if(rem == target)
            {
                count++ ; 
            }
        }

        return count ;
    }
}
