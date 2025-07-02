import java.util.Stack;

public class pushElementAtAnyIndex {
    public static void main(String[] args) {
//        push at any index
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int idx = 2;
        int x = 7;
        Stack<Integer> temp = new Stack<>();
        while(s.size()>idx){
            temp.push(s.pop());
        }
        s.push(x);

        while(temp.size()>0){
            s.push(temp.pop());
        }
        System.out.println(s);



    }


}

