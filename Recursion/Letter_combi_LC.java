public class Letter_combi_LC {
    public static void main(String[] args) {
        String [] key = {"", "" , "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"} ;
        key_pad("23", "", key);
    }
    public static void key_pad(String ques, String ans, String key[])
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            return ;
        }
        char ch = ques.charAt(0) ;  // '2' 
        String get = key[ch - '0'] ;   // 2 -> abc
        for(int i = 0 ; i < get.length() ; i++)
        {
            key_pad(ques.substring(1), ans+ get.charAt(i), key);
        }
    }
}
