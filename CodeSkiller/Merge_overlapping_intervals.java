public class Merge_overlapping_intervals {
    public static void main(String[] args) {
        int [][] arr = {{1,3}, {2,6}, {8,10}, {15,18}} ;
        int index = 0 ; 
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[index][1] >= arr[i][0])
            {
                arr[index][1] = Math.max(arr[i][1] , arr[index][1]) ;
            }
            else
            {
                index++ ;
                arr[index][0] = arr[i][0] ; 
                arr[index][1] = arr[i][1] ; 
            }
        }
        
        for (int i = 0; i <= index ; i++) {
            System.out.println(arr[i][0]+" "+ arr[i][1]);
        }
    }
}
