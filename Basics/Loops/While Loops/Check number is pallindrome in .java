/*
TERMINAL : 
11411
Pallindorme : 11411


#CODE 
*/

import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int temp = n ;
        int revdigi = 0 ;
        
        while(n > 0)
        {
            int sum = n % 10 ;
            revdigi = revdigi * 10 + sum ;
            n = n / 10 ;
        }
        if (revdigi == temp ) 
        {
            System.out.printf("Pallindorme : %d",temp);
        }
        else 
        {
            System.out.printf("Not Pallindorme");
        }
    }
}
