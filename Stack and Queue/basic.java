import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(10); 
        st.push(20); 
        st.push(30); 
        st.push(40); 
        st.push(50); 
        System.out.println(st); // stack ko print kro
        System.out.println(st.peek());  // top ko dekhne ke liye
        st.pop() ;
        System.out.println(st);
        System.out.println(st.isEmpty());  // check if stack is empty
        System.out.println(st.size());  // size of stack
    }
}
