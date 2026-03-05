public class q31 {
    public static void main(String[] args) {
        String str = "cataaple" ; 
        char word = 'a' ; 
        System.out.println(replace(str , word ,0));
    }

    public static String replace(String str , char word , int idx)
    {
        if(idx == str.length())
        {
            return "" ; 
        }
        char ch = str.charAt(idx) ;
        if(ch == 'a')
        {
            ch = 'o' ;
        }
        return ch + replace(str, word, idx+1) ;
    }
}
