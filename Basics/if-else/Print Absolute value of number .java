import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        if (n>0)
        {
            System.out.println("abs value : "+n);
        }
        if(n<0)
        {
            n = n * (-1) ;
            System.out.println("abs value : "+n);
        }
    }
}
