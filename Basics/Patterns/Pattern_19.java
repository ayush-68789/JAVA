package Patterns;

public class Pattern_19 {
    public static void main(String[] args) {
        int n = 7  ;
        int star = n/2+1 ; 
        int space = -1 ;

        int i = 1 ; 
        while (i <= n)
        {
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print("* ");
                j++ ; 
            }

            int k = 1 ; 
            while (k <= space) 
            {
                System.out.print("  ");
                k++ ;    
            }

            int l = 1 ; 
            if(i == 1 || i==n)  // removing extra star
            {
                l = 2 ;
            }
            while(l <= star)
            {
                System.out.print("* ");
                l++ ;
            }

            //mirror
            if(i >= (n/2)+1)
            {
                star++ ; 
                space-= 2 ;
            }
            else{
                star--;
                space+= 2 ;
            }
            i++ ; 
            System.out.println();
        }
    }
}