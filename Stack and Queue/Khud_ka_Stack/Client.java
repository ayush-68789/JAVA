public class Client {
    public static void main(String[] args) throws Exception{
        Stack st = new Stack(5) ;
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.Display();
        st.peek() ; 
        st.pop() ; 
        st.Display();
        st.size() ;
    }
}
