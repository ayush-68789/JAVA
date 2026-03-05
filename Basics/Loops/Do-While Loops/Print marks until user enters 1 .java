import java.util.Scanner ;
class Main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in) ;
        int choice ;
        do
        {
            System.out.print("Enter Choice : ") ;
            choice = sc.nextInt() ; 
            if (choice == 1)
            {
                System.out.print("Enter Marks : ") ;
                int marks = sc.nextInt() ; 
                if (marks >= 90)
                {
                    System.out.println("This is good.") ;
                }
                else if (marks <= 89 && marks >= 60)
                {
                    System.out.println("This is also good") ;
                }
                else if (marks <= 59 && marks >= 0)
                {
                    System.out.println("This is good as well") ;
                }   
            }
            else
            {
                break ;    
            }
        }
        while(choice!=0) ;
    }
}
