/* 
TERMINAL : 
5639
revrese : 9365

*/

// CODE

import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int revdigi = 0 ;
        int temp = n ;
        
        while(temp > 0)
        {
            int sum = temp % 10 ;
            revdigi = revdigi * 10 + sum ;
            temp = temp / 10 ;
        }
        System.out.printf("revrese : %d",revdigi);
    }
}
