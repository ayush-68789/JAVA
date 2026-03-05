public class printSub_sequence {
    public static void main(String[] args) {
        String s = "ab" ;
        System.out.println("\n"+ssbq(s, "")) ;
    }    
    public static int ssbq(String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.print(ans+ " "); 
            return 1;
        }
        char ch = s.charAt(0) ;
        int a1 = ssbq(s.substring(1), ans);
        int a2 = ssbq(s.substring(1), ans+ch);
        return a1+ a2 ; 
    }
} 
