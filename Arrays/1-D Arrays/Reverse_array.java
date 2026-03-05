public class Reverse_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11} ;
        int start = 3 ; 
        int end = 9 ; 

        reverse(arr,start,end) ;

        for(int i = 0 ;i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int arr[], int start, int end){
        while(start <= end)
        {
            int temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start++; 
            end--; 
        }
    }
}

