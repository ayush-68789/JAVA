public class q20 {
    public static void main(String[] args) {
        String word = "coding" ; 
        System.out.println(vowel(word, 0));
    }

    public static int vowel(String str , int idx)
    {
        if(idx == str.length())
        {
            return 0 ;
        }
        char ch = str.charAt(idx) ;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            return 1 + vowel(str, idx+1) ;
        }
        else
        {
            return vowel(str, idx+1) ;
        }
    }
}
