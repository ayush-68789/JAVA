public class q30 {
    public static void main(String[] args) {
        String str = "hello" ; 
        System.out.println(length(str,0));
    }
    public static int length (String str , int idx)
    {
        if(idx == str.length())
        {
            return 0 ; 
        }
        else
        {
            return 1 + length(str , idx+ 1) ;
        }
    }
}
