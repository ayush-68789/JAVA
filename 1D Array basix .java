import java.util.Arrays ;                        // used to import functions of array

public class Main 
{
    public static void main(String args[])
    {
        int marks[] = {84,564,54} ;
        
        
        /*
        >>>> can also be initalised like this <<<<<
        int marks[] = new int[3] ;
        marks[0] = 84 ; 
        marks[1] = 75 ;
        marks[2] = 89 ;
        */
        
        
        System.out.println(marks[0]) ;
        System.out.println(marks[1]) ;
        System.out.println(marks[2]) ;
        
        System.out.println(marks.length) ;        // prints the length of array 
        
        Arrays.sort(marks) ;
        System.out.println("sorted Array -->");
        System.out.println(marks[0]) ;
        System.out.println(marks[1]) ;
        System.out.println(marks[2]) ;
    }
}
