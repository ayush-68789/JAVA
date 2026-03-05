import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter range : ");
        int range = sc.nextInt() ;
        for(int i = 0 ; i <= range ; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
