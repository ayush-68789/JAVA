public class Search_in_Matrix_II {
    public static void main(String[] args) {
        int[][]matrix = {
            {1,4,7,11,15}
            ,{2,5,8,12,19}
            ,{3,6,9,16,22}
            ,{10,13,14,17,24},
            {18,21,23,26,30}} ;

        System.out.println(Search_in_Matrix(matrix, 5));
    }

    public static boolean Search_in_Matrix(int[][] matrix, int target)
    {
        //hum peeche se start krenge 0,4 se kyu ki agr humne 0,0 se start kiyya toh humara target upr bhi ho skta h aur neeche bhi but peeche se ke liye ya toh neeche hogaa ya toh 
        int row = 0 ; 
        int col = matrix[0].length-1 ;   

        while (row < matrix.length && col < matrix[0].length) 
        {
            if(matrix[row][col] == target)   
            {
                return true ;       // agr target ke equal ho jayega to KAAM TAMAM
            }    
            else if (matrix[row][col] > target)   
            {
                col-- ;    // agr value target se bdi ho gyi toh left ke side move krne lgenge column ke along
            }
            else
            {
                row++ ;     // agr value target se choti hogyi toh neeche move kr jayenge row ke along
            }
        }
        return false ;
    }
}
