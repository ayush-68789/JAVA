public class Selection_sort {
    public static void main(String[] args) {
        int [] arr = {4, -1 , 5 , 3 , 1 , 2 } ; 
        selection_sort(arr);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void selection_sort(int[] arr)
    {
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            int idx = min_index(arr, i) ;   //minimum index milne ke baad elements ko swap krdo
            int temp = arr[i] ;
            arr[i] = arr[idx] ; 
            arr[idx] = temp ;
        }
    }

    public static int min_index(int []arr , int index)
    {
        int mini = index ;  // ith position wale element ko meine  smallest assume krliya   mtlb unsorted part ke first index ko 
        for(int j = index+1 ; j < arr.length ; j++ )
        {
            if(arr[mini] > arr[j])   // agr mera suppose kiya hua index se chota kuch aur mila toh hum usko mini assign krdenge aur vo update hota rahega
            {
                mini = j ;    
            }
        }
        return mini ; 
    }
}

