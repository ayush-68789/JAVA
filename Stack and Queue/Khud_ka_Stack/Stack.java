public class Stack {
    private int [] arr  ;
    private int idx = -1 ;
    public Stack(int n)
    {
        arr = new int[n] ; 
    }
    public boolean isEmpty()
    {
        return idx == -1 ;
    }
    public boolean isFull()
    {
        return idx == arr.length-1 ;
    }
    public void size()
    {
        System.out.println(idx +1) ; 
    }
    public void push(int item)
    {
        try {
            idx ++ ; 
            arr[idx] = item ;
        } catch (Exception e) {
            e.getStackTrace() ;   
        }
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack khaali h baklol...") ;
        }
        int rem = arr[idx] ; 
        idx -- ; 
        return rem ;
    }
    public void peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack khaali h baklol...") ;
        }
        System.out.println(arr[idx]) ;
    } 
    public void Display()
    {
        for(int i = 0 ; i <= idx ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
