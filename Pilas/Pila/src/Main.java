import upb.edu.co.stack.ListStack;


public class Main {
    public static void main(String[] args) {

        ListStack stack = new ListStack();
        for (int i = 10; i > 0 ; i--) {
            stack.push(i);
        }

        Object o;
        while((o = stack.pop())!=null){
            System.out.println(o);
        }

        while((o = stack.pop())!=null){
            System.out.println(o);
        }
        System.out.println(stack.toString());
        if (stack.isEmpty()){
            System.out.println("gola");
        }

        if (stack.isEmpty()){
            System.out.println("gola");
        }
    }
}
