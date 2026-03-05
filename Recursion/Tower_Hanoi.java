public class Tower_Hanoi {
    public static void main(String[] args) {
        int n = 3 ; 
        toh(n , 'a', 'b', 'c') ;
    }
    public static void toh(int n , char src , char help , char des )
    {
        toh(n-1, src, des, help);
    }
}