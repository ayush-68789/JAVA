public class next_greater_element {
    public static void main(String[] args) {
        int [] arr = {4,5,2,10} ;
        for(int i = 0 ; i < arr.length ;i++)
        {
            int num = arr[i] ;
            if (i == arr.length - 1)
            {
                arr[i] = -1 ;
                break ;
            }
            boolean isgreat = false ; 
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(num < arr[j])
                {
                    arr[i] = arr[j] ;
                    isgreat = true ;
                    break ; 
                }
            }
            if(isgreat == false)
            {
                arr[i] = -1 ;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
