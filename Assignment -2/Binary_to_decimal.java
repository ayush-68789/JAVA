import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        System.out.println(Binary2decimal(n ));
        sc.close();
    }

    public static int Binary2decimal(int n )
    {
        int res  =  0 ; 
        int place = 0 ; 
        while(n > 0)
        {
            int rem = n % 10 ;
            res += rem* Math.pow(2,place);
            place++ ; 
            n/= 10 ; 
        }

        return res ;
    }
}
