public class coin_permutation {
    public static void main(String[] args) {
        int [] coin = {2, 3 ,5} ; 
        int amt = 8 ; 
        permut(coin, amt, "") ;
    }

    public static void permut(int [] coin , int amt , String ans)
    {
        if(amt == 0)
        {
            System.out.println( ans);
            return ; 
        }
        for(int i = 0 ; i < coin.length ; i++)
        {
            if(amt >= coin[i])
            {
                permut(coin, amt - coin[i], ans + coin[i]);
            }
        }
    }
}
