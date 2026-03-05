public class ZigZag {
    public static void main(String[] args) {
        int n = 2  ;
        zz(n) ; 
    }    
    public static void zz (int n)
    {
        if(n == 0)
        {
            return ;
        }
        System.out.println("pre"+n);
        zz(n-1) ; 
        System.out.println("In"+n);
        zz(n-1) ;
        System.out.println("post"+n);
    }
}
