import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Escriba el tamaño de su cuadrado magico, debe ser positivo e impar: ");
        int n = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            n = Integer.parseInt(scan.nextLine());

            if (n < 0 || n % 2 == 0) {
                System.out.println("Su numero es negativo o impar");
            } else {
                break;
            }
        }
        int cont = 1;
        int columna = 0;
        int fila = n / 2;
        int colum_ante = 0;
        int fila_ante = 0;
        int[][] matriz = new int[n][n];

        while (cont != (n * n) + 1) {
            if (matriz[columna][fila] == 0) {//Para cuando esta vacia la posición
                matriz[columna][fila] = cont;
            } else {
                columna = colum_ante + 1;
                fila = fila_ante;
                matriz[columna][fila] = cont;
            }
            colum_ante = columna;
            fila_ante = fila;
            cont++;
            fila++;
            columna--;

            //Si se sale de la matriz desde la parte superior derecha
            if (columna < 0 && fila == n) {
                columna = n - 1;
                fila = 0;
            } else if (columna < 0) {
                columna = columna + n;
            } else if (fila == n) {
                fila = 0;
            }
        }
        
        //Impresion de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
