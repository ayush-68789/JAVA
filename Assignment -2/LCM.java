import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt();

        int lcm = (n1 * n2) / hcf_gcd(n1, n2) ;
        System.out.println(lcm);

        sc.close();
    }
    
    public static int hcf_gcd(int n1 , int n2)
    {
        while(n1 % n2 != 0)
        {
            int rem = n1 % n2 ; 
            n1 = n2 ; 
            n2 = rem ;
        }
        return n2 ;
    }
}
