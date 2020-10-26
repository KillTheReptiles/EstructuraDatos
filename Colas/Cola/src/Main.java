import upb.edu.co.queue.ListQueue;

public class Main {

    public static void main(String[] args) {
        ListQueue ejemplo = new ListQueue();
        for (int i = 0; i < 10 ; i++) {
            ejemplo.insert(i);
        }

        ejemplo.extract();
        ejemplo.extract();
        ejemplo.clear();
        if (ejemplo.isEmpty()){
            System.out.println("hola");
        }

    }
}
