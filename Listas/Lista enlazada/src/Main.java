import upb.edu.co.list.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean centinela = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la opcion: \n" +
                "1. Recorrer lista con metodo recursivon\n" +
                "2. Ver baraja de póker en orden y desorden\n" +
                "3. Calculadora basica\n" +
                "4. Sumar vectores junto a su producto escalar\n" +
                "5. Salir");
        while (centinela == true) {
            int numero = Integer.parseInt(scan.nextLine());
            switch (numero) {
                case 1: //1. Escriba un método que recorra una lista de forma recursiva.
                    List list1 = new List();
                    list1.add(5);
                    list1.add(41);
                    list1.add(10);
                    list1.add(40);
                    System.out.println("Hola");
                    list1.rec(list1.head);
                    break;

                case 2://2.Escriba un programa que mezcle un número n de veces las cartas de una baraja de póker
                    // (https://es.wikipedia.org/wiki/Baraja_inglesa) que en un inicio estarán ordenadas. Y también pueda reiniciar ordenando por un palo.
                    System.out.println("Hola");
                    List barajas = new List();
                    barajas.add("A");
                    barajas.add(2);
                    barajas.add(3);
                    barajas.add(4);
                    barajas.add(5);
                    barajas.add(6);
                    barajas.add(7);
                    barajas.add(8);
                    barajas.add(9);
                    barajas.add(10);
                    barajas.add("J");
                    barajas.add("Q");
                    barajas.add("K");
                    //ORDENADO
                    String barajOrd = "A ,2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K";
                    System.out.println("Tu baraja ordenada es: " + barajOrd);
                    //DESORDENADO
                    Object[] bara = barajas.toArray();
                    List baraFinal = new List();
                    break;

                case 3:/*Escriba un programa para una calculadora básica (+, -,*,/)
                 (https://www.smartick.es/blog/matematicas/divisiones/como-resolver-divisiones-de-2-cifras/) de números enteros mayores a 30 dígitos.*/
                    System.out.println("Hola");
                    System.out.println("¿Que deseas hacer?:\n" +
                            "1 para sumar\n" +
                            "2 para restar\n" +
                            "3 para multiplicar\n" +
                            "4 para dividir");
                    Scanner tres = new Scanner(System.in);
                    int simbolos = Integer.parseInt(tres.nextLine());

                    List calculadora1 = new List();
                    System.out.println("Escriba el numero: ");
                    String cal1 = scan.nextLine();

                    for (int i = 0; i < cal1.length(); i++) {
                        calculadora1.add(Character.getNumericValue(cal1.charAt(i)));
                    }

                    System.out.println("Escriba el otro numero: ");
                    List calculadora2 = new List();
                    String cal2 = scan.nextLine();
                    for (int i = 0; i < cal2.length(); i++) {
                        calculadora2.add(Character.getNumericValue(cal2.charAt(i)));
                    }

                    List cal1Inv = new List();
                    Object[] cal1InvAr = calculadora1.toArray();
                    for (int i = cal1InvAr.length - 1; i >= 0; i--) {
                        cal1Inv.add(cal1InvAr[i]);
                    }

                    List cal2Inv = new List();
                    Object[] cal2InvAr = calculadora2.toArray();
                    for (int i = cal2InvAr.length - 1; i >= 0; i--) {
                        cal2Inv.add(cal2InvAr[i]);
                    }
                /*for (ListNode node = cal2Inv.head; node != null; node=node.next){
                    System.out.println(node.toString());
                }*/
                    switch (simbolos) {
                        case 1: {
                            List res = sumar(calculadora1, calculadora2); //tipo lista

                            System.out.println("La suma es: " + res.head.getObject());
                            break;
                        }
                        case 2: {
                            List centinela2;
                            ListNode node2;
                            String resul = "";
                            int presta = 0;
                            centinela2 = null;
                            node2 = null;
                            boolean negativo;
                            if (cal1Inv.getSize() >= cal2Inv.getSize()) {
                                centinela2 = cal1Inv;
                                node2 = cal2Inv.head;
                                negativo = false;
                            } else {
                                centinela2 = cal2Inv;
                                node2 = cal1Inv.head;
                                negativo = true;
                            }
                            for (ListNode node = centinela2.head; node != null; node = node.next) {
                                String b = "";
                                String c = "";
                                b = node.getObject().toString();
                                if (node2 != null) {
                                    c = node2.getObject().toString();
                                    node2 = node2.next;
                                } else {
                                    c = "0";
                                }
                                int aux = 0;
                                if (Integer.parseInt(b) < Integer.parseInt(c)) {
                                    b = "1" + b;
                                    aux = (Integer.parseInt(b)) - Integer.parseInt(c);
                                    resul = aux + resul;
                                    Object ps = ((int) node.next.getObject() - 1);
                                    node.next.setObject(ps);
                                } else {
                                    aux = Integer.parseInt(b) - Integer.parseInt(c);
                                    resul = aux + resul;
                                }
                            }
                            if (negativo) {
                                System.out.println("Resta total: " + "-" + resul);
                            } else {
                                System.out.println("Resta total: " + resul);
                            }
                            break;
                        }
                        case 3: {
                            for (ListNode node = cal2Inv.head; node != null; node = node.next) {
                                String finale = "";
                                String b = "";
                                String c = "";
                                List prodIn1 = new List();
                                List prodIn2 = new List();
                                String resi = "";
                                b = node.getObject().toString();
                                int cont = 0;
                                for (ListNode nodo2 = cal1Inv.head; nodo2 != null; nodo2 = nodo2.next) {
                                    c = nodo2.getObject().toString();
                                    if (cal2Inv.getSize() == 1) {
                                        resi = String.valueOf(Integer.parseInt(b) * Integer.parseInt(c)) + resi;
                                    }
                                    if (cont == 0 && cal2Inv.getSize() > 1) {
                                        prodIn1.add(Integer.parseInt(b) * Integer.parseInt(c));
                                        cont++;
                                    } else {
                                        for (int i = 0; i < cont; i++) {
                                            prodIn2.add(0);
                                        }
                                        prodIn2.add(Integer.parseInt(b) * Integer.parseInt(c));
                                        prodIn1 = sumar(prodIn1, prodIn2);
                                    }

                                }
                                System.out.println("La multiplicacion es: " + resi);
                            }
                            break;
                        }
                        case 4: {
                            for (ListNode node = calculadora1.head; node != null; node = node.next) {
                                String b = "";
                                String c = "";
                                b = node.getObject().toString();
                                for (ListNode node2 = calculadora2.head; node2 != null; node2 = node2.next) {
                                    c = node2.getObject().toString();
                                }
                                
                            }
                            break;
                        }

                    }
                    centinela = false;
                    System.out.println("Gracias por usarme :D");
                    break;

                case 4: /*Un vector disperso es aquel que tiene muchos elementos que son cero. Escribir un programa que represente un vector
                  disperso con listas enlazadas. Los nodos son los elementos del vector distintos de cero. Cada nodo contendrá el valor
                  del elemento y su índice (posición del vector). El programa ha de realizar las operaciones: sumar dos vectores
                  (https://www.fisicalab.com/apartado/suma-de-vectores)  de igual dimensión y hallar el producto escalar
                  (https://www.geogebra.org/m/tmvZQMwr). */
                    System.out.println("Hola");

                    System.out.println("Escribe el numero de elementos a escribir");
                    Scanner sc = new Scanner(System.in);
                    int cantidad = Integer.parseInt(sc.nextLine());
                    List vectorSuma = new List();
                    int v1 = 0;
                    int v2 = 0;
                    int finalProdu = 0;
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Escribe el elemento del vector 1: ");
                        v1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Escribe el elemento del vector 2: ");
                        v2 = Integer.parseInt(sc.nextLine());
                        int finalSu = v1 + v2;
                        vectorSuma.add(finalSu);
                        finalProdu += v1 * v2;
                    }
                    String suma = "";

                    for (ListNode node = vectorSuma.head; node != null; node = node.next) {
                        suma += node.getObject().toString() + " ";
                    }
                    System.out.println("Aqui esta la suma de los vectores: < " + suma + ">\n" +
                            "Aqui esta el producto escalar: " + finalProdu);
                    break;
                case 5:
                    centinela = false;
                    System.out.println("Espero haberte ayudado :D");
                    break;
            }
        }
    }

    public static List sumar(List l1, List l2) {
        List cal1Inv = new List();
        Object[] cal1InvAr = l1.toArray();
        for (int i = cal1InvAr.length - 1; i >= 0; i--) {
            cal1Inv.add(cal1InvAr[i]);
        }

        List cal2Inv = new List();
        Object[] cal2InvAr = l2.toArray();
        for (int i = cal2InvAr.length - 1; i >= 0; i--) {
            cal2Inv.add(cal2InvAr[i]);
        }
        String resi = "";
        int lleva = 0;

        List centinela2;
        ListNode node2;
        if (cal1Inv.getSize() > cal2Inv.getSize()) {
            centinela2 = cal1Inv;
            node2 = cal2Inv.head;
        } else {
            centinela2 = cal2Inv;
            node2 = cal1Inv.head;
        }
        for (ListNode node = centinela2.head; node != null; node = node.next) {
            String b = "";
            String c = "";

            b = node.getObject().toString();
            if (node2 != null) {
                c = node2.getObject().toString();
                node2 = node2.next;

            } else {
                c = "0";
            }

            int aux = Integer.parseInt(b) + Integer.parseInt(c) + lleva;
            if (aux > 9) {
                resi = aux % 10 + resi;
                lleva = aux / 10;
            } else {
                resi = aux + resi;
                lleva = 0;
            }
        }
        if (lleva > 0) resi = lleva + resi;

        List resultado = new List();
        resultado.add(resi);

        return resultado;

    }
}