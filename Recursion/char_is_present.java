public class char_is_present {
    public static void main(String[] args) {
        String st = "abcbhja0ijai" ;
        char ch = 'a' ; 
        int i = 2 ; 
        System.out.println(is_present(st, ch, i));
    }

    public static boolean is_present(String st , char ch , int idx)
    {
        if(idx == st.length())
        {
            return false ;
        }
        if(st.charAt(idx) == ch)
        {
            return true ; 
        }
        return is_present(st, ch, idx+1) ;
    }
}
