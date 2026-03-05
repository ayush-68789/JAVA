import java.util.Scanner ;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        
        System.out.print("Enter length : ") ;
        int length = sc.nextInt() ;
        
        System.out.print("Enter breadth : ") ;
        int breadth = sc.nextInt() ;
        
        int perimtr = 2*(length + breadth) ;
        int area = length * breadth ;
        
        if (area > perimtr)
        {
            System.out.println("AREA IS LARGER !!") ;
        }
        if (area < perimtr)
        {
            System.out.println("PERIMETER IS LARGER !!");
        }
        if (area == perimtr)
        {
            System.out.println("BOTH ARE EQUAL !!");
        }
    }
}
