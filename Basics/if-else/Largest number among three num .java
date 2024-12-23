import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enetr first number : ");
        int a = sc.nextInt() ;
        
        System.out.print("enetr Second number : ");
        int b = sc.nextInt() ;  
        
        System.out.print("enetr third number : ");
        int c = sc.nextInt() ;
        
        if (a>b && a>c)
        {
            System.out.println(a+" is largest");
        }
        
        else if(b>c && b>a)
        {
            System.out.println(b+" is largest");
        }
        
        else if(c>a && c>b)
        {
            System.out.println(c+" is largest");
        }
        
        else if(a==b)
        {
            if (a>c)
            {
                System.out.println(a+" is largest");
            }
            else
            {
                System.out.println(c+" is largest");
            }
        }
        
        else if(b==c)
        {
            if (b>a)
            {
                System.out.println(b+" is largest");
            }
            else
            {
                System.out.println(a+" is largest");
            }
        }
        
        else if(c==a)
        {
            if (c>b)
            {
                System.out.println(a+" is largest");
            }
            else
            {
                System.out.println(b+" is largest");
            }
        }
    }
}
