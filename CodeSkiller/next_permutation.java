public class next_permutation {
    public static void main(String[] args) {
        int [] arr = {1,2,3} ;
        int pivot = -1 ;
        for(int i = arr.length-2 ; i >=0 ; i--)
        {
            if(arr[i] < arr[i+1])
            {
                pivot = i ;
                break ;
            }
        }
        if(pivot == -1)
        {
            int start = 0 ;
            int end = arr.length-1 ;
            while(start <= end)
            {
                int temp = arr[start] ; 
                arr[start] = arr[end] ;
                arr[end] = temp ;
                start++ ; 
                end-- ;
            }
        }
        
        for(int i = arr.length-1 ; i >= pivot ; i--)
        {
            if(arr[pivot] < arr[i])
            {
                int temp = arr[pivot] ; 
                arr[pivot] = arr[i] ; 
                arr[i] = temp ;
                break ;
            }
        }

        int start = pivot+1 ;
        int end = arr.length-1 ;
        while(start <= end)
        {
            int temp = arr[start] ; 
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start++ ; 
            end-- ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
