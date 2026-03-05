/*
#TERMINAL 
    3639
Lucky number

    56669
NOT a lucky number

*/

import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int three = 0 , nine = 0 ;
        while (n>0)
        {
            if (n%10 == 3)
            {
                three = 1; 
            }
            else if (n%10 == 9)
            {
                nine = 1 ;
            }
            n= n /10 ;
        }
        
        if (three==1 && nine==1)
        {
            System.out.printf("Lucky number");
        }
        else
        {
            System.out.println("NOT a lucky number");    
        }
    }
}
