import java.util.Stack;

public class Reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);


        Stack<Integer> st_reverse = new Stack<>();
//        using while loop
        while(!st.empty()){
            st_reverse.push(st.pop());
        }
        System.out.println(st_reverse);

    }
}
