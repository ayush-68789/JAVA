public class own_equals_fn {
    public static void main(String[] args) {
        String s1 = "hello" ; 
        String s2 = "hello" ;
        System.out.println(equals(s1, s2));
    }
    public static boolean equals(String s1 , String s2)
    {
        if(s1 == s2)   // address check kro 
        {
            return true ;
        }
        if(s1.length() != s2.length())    // lenngth check kro 
        {
            return false ;
        }
        for(int i = 0 ; i < s1.length() ; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return false ;
            }
        }
        return true ;
    }
}
