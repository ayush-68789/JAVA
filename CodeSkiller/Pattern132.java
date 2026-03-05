import java.util.Scanner;
public class Pattern132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int [] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        int a = 0 ; 
        int b = 1 ; 
        int c = 2 ; 

        int count = 0 ;
        for(int i = 2 ; i < n ; i++)
        {
            if(arr[a] < arr[c] && arr[c] < arr[b])
            {
                count++ ;
            }
            a++ ; 
            b++ ;
            c++ ;
        }

        if(count == 0)
        {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        sc.close();
    }
}