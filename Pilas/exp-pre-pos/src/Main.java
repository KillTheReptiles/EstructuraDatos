import upb.edu.co.stack.ListStack;

import java.util.Scanner;

public class Main {
    private static String posfija;
    private static char simbolo;
    private static ListStack operadores = new ListStack();
    private static ListStack operadoresChar = new ListStack();

    public static void main(String[] args) {
        System.out.println("Escribe la expresión");
        Scanner scan = new Scanner(System.in);
        String expresion = scan.nextLine();

        int prioridad;
        posfija = "";
        for (int i = 0; i < expresion.length(); i++) {
            String temp = String.valueOf(expresion.charAt(i));
            while (true) {
                if (temp.equals("^")) {
                    prioridad = 3;
                    simbolo = '^';
                    if (!siOperador(operadoresChar, operadores, prioridad)) break;
                }
                if (temp.equals("*")) {
                    prioridad = 2;
                    simbolo = '*';
                    if (!siOperador(operadoresChar, operadores, prioridad)) break;
                }
                if (temp.equals("/")) {
                    prioridad = 2;
                    simbolo = '/';
                    if (!siOperador(operadoresChar, operadores, prioridad)) break;
                }
                if (temp.equals("+")) {
                    prioridad = 1;
                    simbolo = '+';
                    if (!siOperador(operadoresChar, operadores, prioridad)) break;
                }
                if (temp.equals("-")) {
                    prioridad = 1;
                    simbolo = '-';
                    if (!siOperador(operadoresChar, operadores, prioridad)) break;
                }
                if (temp.equals("(")) {
                    prioridad = 0;
                    simbolo = '(';
                    operadores.push(prioridad);
                    operadoresChar.push(simbolo);
                    break;
                }
                if (temp.equals(")")) {
                    int cont = 0;
                    while (true) {
                        if (String.valueOf(operadoresChar.peek()).equals("(")) {//4.2
                            operadores.pop();
                            operadoresChar.pop();
                            break;
                        }
                        posfija += String.valueOf(operadoresChar.peek()); //4.1
                        operadores.pop();
                        operadoresChar.pop();

                    }
                    break;
                }
                if (!(temp.equals("^") || temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals(")") || temp.equals("("))) {
                    posfija += temp;
                    break;
                }
            }
        }
        for (int i = 0; i < posfija.length(); i++) {
            char operador = posfija.charAt(i);
        }
        System.out.println(posfija);
    }

    private static boolean siOperador(ListStack operadoresChar, ListStack operadores, int prioridad) {
        if (operadores.isEmpty()) {
            operadores.push(prioridad);
            operadoresChar.push(simbolo);
        } else {
            if (prioridad > (int) operadores.peek()) {
                operadores.push(prioridad);
                operadoresChar.push(simbolo);
                return false;
            } else if (prioridad <= (int) operadores.peek()) {
                posfija += operadoresChar.peek();
                operadores.pop();
                operadoresChar.pop();
                return true;
            }
        }
        return false;
    }
}