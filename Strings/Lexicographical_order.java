public class Lexicographical_order {
    public static void main(String[] args) {
        String s1 = "kunal" ;
        String s2 = "komal" ;
        System.out.println(s1.compareTo(s2)) ;    // s1 > s2 +ve       s1 < s2  -ve     returns the ascii code of(o-u)
        String s3 = "ankit" ;
        String s4 = "ankita" ;
        System.out.println(s3.compareTo(s4)) ;      //to unka diff of length print ho jayega (s3 ki length) - (s4 ki length)
        System.out.println(lexicographic(s3, s4));
    }

    public static int lexicographic(String s1, String s2)
    {
        if(s1 == s2 )
        {
            return 0 ;
        }
        int n = Math.min(s1.length(), s2.length()) ;
        for(int i = 0 ; i < n ; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return s1.charAt(i) - s2.charAt(i); 
            }
        }
        return s1.length() - s2.length() ;
    }
}
