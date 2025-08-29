public class Selection_sort {
    public static void main(String[] args) {
        int [] arr = {13, 15 , 9 , 11 , 7 } ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int mini = i ; 
            for(int j = i ; j < arr.length ; j++)
            {
                if(arr[j] < arr[mini])
                {
                    mini = j ; 
                }
                swap(arr, i, mini);
            }
        }

        printarr(arr);

    }

    public static void swap(int [] arr , int start ,int end)
    {
        while(start <= end)
        {
            int temp = arr[start] ; 
            arr[start] = arr[end] ;
            arr[end] = temp ; 
            start++ ; 
            end-- ;
        }
    }

    public static void printarr(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
