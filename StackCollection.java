import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[]={1,2,3,4};
        for(int i:arr)
        {
            st.push(i);
        }
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
    }
}
