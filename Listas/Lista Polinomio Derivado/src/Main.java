import upb.edu.co.list.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List polinomio = new List();
        List gradoTerminoL = new List();

        System.out.println("Escriba la cantidad de elementos a ingresar: ");
        Scanner scan = new Scanner(System.in);
        int grado = Integer.parseInt(scan.nextLine());

        String finale = "";

        int gradoTermino = 0;

        for (int i = 1; i <= grado; i++) {
            System.out.println("Ingrese el termino independiente " + i);
            polinomio.add(Integer.parseInt(scan.nextLine()));
            System.out.println("Ingrese el grado del termino independiente " + i);
            gradoTerminoL.add(Integer.parseInt(scan.nextLine()));
        }

        List poliInver = new List();
        Object[] polArr = polinomio.toArray();
        for (int i = polArr.length - 1; i >= 0; i--) {
            poliInver.add(polArr[i]);
        }

        List gradoTerInve = new List();
        Object[] polArr2 = gradoTerminoL.toArray();
        for (int i = polArr2.length - 1; i >= 0; i--) {
            gradoTerInve.add(polArr2[i]);
        }

        int termino = 0;
        ListNode node2 = gradoTerInve.head;
        for (ListNode node = poliInver.head; node != null; node = node.next) {

            if (node2 != null) {
                gradoTermino = Integer.parseInt(node2.getObject().toString());
                node2 = node2.next;
            }
            termino = Integer.parseInt(node.getObject().toString());
            if (gradoTermino == 0) {
                finale = "+" + 0 + finale;
            } else {
                if (termino >= 0) {
                    finale = (("+" + termino * gradoTermino) + "x^" + (gradoTermino - 1)) + finale;
                } else {
                    finale = ((termino * gradoTermino) + "x^" + (gradoTermino - 1)) + finale;
                }

            }
        }
        System.out.println("La derivada de tu polinomio es: "+finale);
    }
}