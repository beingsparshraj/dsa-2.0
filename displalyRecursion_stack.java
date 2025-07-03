import java.util.Stack;

public class displalyRecursion_stack {
    public static void displayRec(Stack<Integer> s) {
        if (s.size() == 0) return;
        int top = s.pop();
        System.out.print(top + " ");
        displayRec(s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        displayRec(s);
        System.out.println(s);

    }
}
