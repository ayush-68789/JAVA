public class twin_combination {
    public static void main(String[] args) {
        int n = 4 ; 
        boolean [] board = new boolean[n] ; 
        int tq = 2 ;
        permut(board, tq, "" , 0);
    }

    public static void permut(boolean[] board , int tq , String ans, int qpsf) 
    {
        if(qpsf == tq)
        {
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i] == false)
            {
                board[i] = true ;
                permut(board, tq, ans+'b' + i + 'q' + qpsf , qpsf +1 );
            }
        }
    }
}
