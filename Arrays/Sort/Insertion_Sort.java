public class Insertion_Sort
{
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9,2} ; 
        insertion_sort(arr) ; 
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertion_sort(int[]arr)
    {
        for(int i = 1 ; i < arr.length ; i++)   // Starts from index 1 because we treat the first element arr[0] as already sorted.
        {
            int current = arr[i] ;    // store krdo current element ko 
            int prev_idx= i-1 ;       // ismein prev index store krdo 
            while(prev_idx >=0 && arr[prev_idx] > current)          // loop tb tk chalega jb tk index 0 ya usse bda ho aur jb tk prev element current se bda hoga
            {                                                       
                arr[prev_idx+1] = arr[prev_idx] ;       // arr[prev+1] pr arr[prev] store krdenge
                prev_idx-- ;                            // peeche jaata jayegaa
            }
            arr[prev_idx + 1] = current;                
        }
    }
}