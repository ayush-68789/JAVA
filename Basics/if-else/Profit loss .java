import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter cost price : ") ;
        int cp = sc.nextInt() ;
        
        System.out.print("enter selling prioce : ");
        int sp = sc.nextInt() ;
        
        if (cp < sp)
        {
            int profit = sp - cp ;
            System.out.println("Yaayy !! Made PROFIT of "+profit) ;
        }
        if (cp > sp)
        {
            int loss = cp - sp ;
            System.out.println("NOOO !! it's a LOSS of "+loss) ;
        }
    }
}
