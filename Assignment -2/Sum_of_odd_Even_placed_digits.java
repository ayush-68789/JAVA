import java.util.Scanner;

public class Sum_of_odd_Even_placed_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int  n = sc.nextInt() ; 
        sum_digi(n);
        sc.close();
    }

    public static void sum_digi(int n)
    {
        int odd_sum = 0 ; 
        int eve_sum = 0 ; 
        int place = 1 ; 
        
        while(n > 0)
        {
            int digit = n % 10 ;
            n = n /10 ; 
            
            if(place % 2 == 0)
            {
                eve_sum += digit ; 
            }
            else
            {
                odd_sum += digit ;
            }
            place++ ;
        }

        System.out.println(odd_sum);
        System.out.println(eve_sum);
    }
}
