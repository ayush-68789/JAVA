public class maze_path {
    public static void main(String[] args) {
        int r = 3 ; 
        int c = 3 ;
        path(0, 0, r-1, c-1, "") ;
    }
    // er -> end row , ec -> end column
    public static void path(int currR ,int currC, int er, int ec, String ans)
    {
        if(er == currR && ec == currC)
        {
            System.out.println(ans);
            return ;
        }
        if(currC > ec || currR > er)
        {
            return ;
        }
        path(currR+1, currC, er, ec, ans+"H") ;
        path(currR, currC+1, er, ec, ans+"V") ;
    }
}
