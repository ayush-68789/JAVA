public class print {
    public static void main(String[] args) {
        int n = 3 ; 
        printss(n) ;
    }    
    public static void printss(int n)
    {
        if(n <= 0)
        {
            return ; 
        }
        System.out.print(n + " " );// preorder
        printss(n-1);
        System.out.print(n + " " );// inorder
        printss(n-1);
        System.out.print(n + " " );// postorder
    }
}
