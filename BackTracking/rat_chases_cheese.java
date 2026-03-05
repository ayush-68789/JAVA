import java.util.Scanner;

public class rat_chases_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int m = sc.nextInt() ; 
        char [][] maze = new char[n][m]; 
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next() ;
            for (int j = 0; j < s.length() ; j++) {
                maze[i][j] = s.charAt(j) ;
            }
        }
        int[][] ans = new int[n][m] ;
        print(maze, n, m,ans) ; 
        sc.close() ;
    }
    public static void print(char [][] maze, int cr , int cc, int [][]ans)
    {
        if(cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X')
        {
            return ;
        }
        if(cr == maze.length-1 && cc == maze[0].length-1)
        {
            display(ans) ; 
            return ;
        }
        maze[cr][cc] = 'X' ;
        ans[cr][cc] = 1 ; 
        print(maze, cr-1, cc, ans); //up
        print(maze, cr, cc-1, ans); //left
        print(maze, cr+1, cc, ans); //down
        print(maze, cr, cc+1, ans); //right
        maze[cr][cc] = 'O' ;
    }

    public static void display(int [] [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }        
    }
}
