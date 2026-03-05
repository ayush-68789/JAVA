public class q29 {
    public static void main(String[] args) {
        String str = "madam"  ; 
        System.out.println(is_pallin(str));
    }

    public static boolean is_pallin(String org)
    {
        return org.equals(reverse(org, org.length()-1, ""));
    }
    public static String reverse(String str,int idx , String rev) 
    {
        if(idx < 0)
        {
            return rev ; 
        }
        else
        {
            rev += str.charAt(idx) ;
            return reverse(str, idx-1, rev) ;
        }
    }
}
