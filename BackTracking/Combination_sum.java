import java.util.ArrayList;

public class Combination_sum {
    public static void main(String[] args) {
        int [] coin = {2, 3 ,5} ; 
        int amt = 8 ; 
        ArrayList<Integer> ll = new ArrayList<>() ;
        permut(coin, amt, ll, 0) ;
    }

    public static void permut(int [] coin , int amt , ArrayList<Integer> ll , int idx)
    {
        if(amt == 0)
        {
            System.out.println( ll);
            return ; 
        }
        for(int i = idx ; i < coin.length ; i++)
        {
            if(amt >= coin[i])
            {
                ll.add(coin[i]) ;
                permut(coin, amt - coin[i], ll , i);
            }
        }
    }
}
