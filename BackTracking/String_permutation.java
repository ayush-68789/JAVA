import java.util.ArrayList;

public class String_permutation {
    public static void main(String[] args) {
        ArrayList <String> ll = new ArrayList<>() ; 
        ArrayList<ArrayList<String>> ans = new ArrayList<>() ; 
        String ques = "nitin" ;
        partition(ques,ll, ans) ;
        System.out.println(ans);
    }    

    public static void partition(String ques, ArrayList<String> ll, ArrayList<ArrayList<String>> ans)
    {
        if(ques.length() == 0)
        {
            // System.out.println(ans);
            ans.add(new ArrayList<>(ll)) ;
            return ;
        }
        for(int cut = 1 ; cut <= ques.length() ; cut++)
        {
            String s = ques.substring(0,cut) ; 
            if(pallindrome(s))
            {
                ll.add(s) ; 
                // partition(ques.substring(cut), ans + s + '|', ll ,ans);
                partition(ques.substring(cut), ll ,ans);
                ll.remove(ll.size()-1) ;
            }
        }
    }

    public static boolean pallindrome(String st)
    {
        int i = 0 ; 
        int j = st.length()-1 ; 
        while(i < j)
        {
            if(st.charAt(i) != st.charAt(j))
            {
                return false ;w
            }
            i++ ; j-- ;
        }
        return true ;
    }
}
