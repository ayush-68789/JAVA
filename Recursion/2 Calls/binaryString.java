
public class binaryString {
    public static void main(String[] args) {
        int n = 2 ; 
        fun(n,"");
    }    
    public static void fun(int n , String ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
            return ;
        }
        fun(n-1 , ans + '0') ;
        fun(n-1 , ans + '1') ;
    }
}
