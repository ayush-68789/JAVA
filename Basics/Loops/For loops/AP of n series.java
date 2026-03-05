# TERMINAL
Enter series : 10
Enter First Term : 3
Enter diff : -2
3
1
-1
-3
-5
-7
-9
-11
-13
-15

#code

import java.util.Scanner ;
class Main 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter series : ");
        int n = sc.nextInt();
        
        System.out.print("Enter First Term : ");
        int a = sc.nextInt() ;
        
        System.out.print("Enter diff : "); 
        int diff = sc.nextInt() ; 
        
        for (int i = 1 ; i <= n ; i++)     
        {
            System.out.println(a + (i-1)*diff);   // A + (N-1)D
        }
        sc.close()
    }
}
