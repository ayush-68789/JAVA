import java.util.Scanner ;
public class Main 
{
    public static void main (String args[])
    {

        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ; 
        int b = sc.nextInt() ; 
        int sum = a + b ;
        System.out.print("sum of a and b :"+sum) ; 
        //System.out.print(a+b) ;   //it also prints the sum without third variable

        //Sytem.out.println("sum of a andd b : "+a+b) ;         it will print sum of and b : 1548
    }
}
