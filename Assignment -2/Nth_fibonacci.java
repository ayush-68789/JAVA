import java.util.Scanner;

public class Nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        fibo(n) ;
        sc.close();
    }
    public static void fibo(int n)
    {
        int a = 0 ; 
        int b = 1 ; 
        int sum = 0 ;
        for(int i = 1; i < n ; i++)
        {
            sum = a + b ; 
            a = b ; 
            b = sum ; 
        }
        System.out.println(sum);
    }
}
