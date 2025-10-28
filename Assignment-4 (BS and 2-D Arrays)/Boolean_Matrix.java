import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int col = sc.nextInt() ;
        int [][] matrix = new int[row][col] ;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j] = sc.nextInt() ;
            }
        }
        sc.close() ;
        int [] rowM = new int[row] ;
        int [] colM = new int[col] ;
        
        for (int i = 0; i < rowM.length; i++) {
            for (int j = 0; j < colM.length; j++) {
                if(matrix[i][j] == 1)
                {
                    rowM[i] = 1 ; 
                    colM[j] = 1 ;
                }
            }
        }
        for (int i = 0; i < rowM.length; i++) {
            for (int j = 0; j < colM.length; j++) {
                if(rowM[i] == 1 || colM[j] == 1)
                {
                    matrix[i][j] = 1 ; 
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }   
    }
}