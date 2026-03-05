import java.util.Scanner ;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter First Number : ");
        int a =  sc.nextInt() ;
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt() ;
        System.out.print("=====================================\n\t\tChoose option\n\t\t1.Additon\n\t\t2.Subtraction\n\t\t3.Multiplication\n\t\t4.Division\n\t\t5.Modulo\n=====================================\n");
        System.out.print("Enter Option : ");
        int choice = sc.nextInt() ;
        switch(choice)
        {
            case 1 :
                System.out.println(a+b) ;
                break ;
            case 2 :
                System.out.println(a-b) ;
                break ;
            case 3 :
                System.out.println(a*b) ;
                break ;
            case 4 : 
                System.out.println(a/b) ;
                break ;
            case 5 : 
                System.out.println(a%b) ;
                break ;
            default :
                System.out.println("<<<<<< INVALID CHOICE >>>>>>") ;
        }
    }
}
