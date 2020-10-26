import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        String opcion;
        String nombre;
        String ciudad;
        String articulos;
        Scanner scan = new Scanner(System.in);
        int userRegistrados = 0;

        /*//ArraysList
        ArrayList proveedores = new ArrayList();
        ArrayList ciudades = new ArrayList();
        ArrayList numero_articulos = new ArrayList();*/

        //Arrays

        String[] proveedoresPrueba = new String[5];
        String[] ciudadesPrueba = new String[5];
        String[] numero_articulosPrueba = new String[5];

        //Pedir datos del usuario al inicio del programa

        System.out.print("Registra tu usuario \n\n");
        System.out.print("Escribe tu nombre: ");
        nombre = scan.nextLine();
        proveedoresPrueba[0] = nombre;

        System.out.print("\nEscribe tu ciudad: ");
        ciudad = scan.nextLine();
        ciudadesPrueba[0] = ciudad;

        System.out.print("\nEscribe el numero de articulos que tienes: ");
        articulos = scan.nextLine();
        numero_articulosPrueba[0] = articulos;
        userRegistrados++;

        //Opciones a elegir
        System.out.print("1. Mirar informacion de usuario \n");
        System.out.print("2. Cambiar ciudad de residencia \n");
        System.out.print("3. Aumentar o disminuir articulos \n");
        System.out.print("4. Registrar un nuevo usuario \n");
        System.out.print("5. Eliminar un usuario \n");
        System.out.print("6. Salir del programa\n");

        //Seleccionar opciones hasta que el usuario desee pararlo
        boolean pedirDatos = true;
        while (pedirDatos) {
            opcion = scan.nextLine();
            switch (Integer.parseInt(opcion)) {
                case 1:
                    System.out.print("Escribe tu nombre: ");
                    nombre = scan.nextLine();
                    if (Arrays.asList(proveedoresPrueba).contains(nombre)) {
                        int posicionUsuario = Arrays.asList(proveedoresPrueba).indexOf(nombre);
                        System.out.println("Su ciudad es: " + Arrays.asList(ciudadesPrueba).get(posicionUsuario));
                        System.out.println("El numero de articulos que provee son: " + Arrays.asList(numero_articulosPrueba).get(posicionUsuario));
                    } else {
                        System.out.print("\nEl usuario que ingreso no existe");
                    }
                    System.out.print("\n------Escribe de nuevo una opción------\n");
                    break;
                case 2:
                    System.out.print("Escribe tu nombre: ");
                    nombre = scan.nextLine();

                    if (Arrays.asList(proveedoresPrueba).contains(nombre)) {

                        System.out.print("Escriba la nueva ciudad: ");
                        ciudad = scan.nextLine();
                        System.out.println("Su nueva ciudad es: " + ciudad);
                        int posicionUsuario = Arrays.asList(proveedoresPrueba).indexOf(nombre);
                        Arrays.asList(ciudadesPrueba).set(posicionUsuario, ciudad);
                    } else {
                        System.out.print("\nEl usuario que ingreso no existe");
                    }
                    System.out.print("\n------Escribe de nuevo una opción------\n");
                    break;
                case 3:
                    System.out.print("Escribe tu nombre: ");
                    nombre = scan.nextLine();
                    System.out.print("Escribe aumentar o reducir: ");
                    String variador = scan.nextLine();
                    System.out.print("Escribe la cantidad: ");
                    articulos = scan.nextLine();
                    if (Arrays.asList(proveedoresPrueba).contains(nombre)) {
                        if (variador.contains("aumentar")) {
                            int posicionUsuario = Arrays.asList(proveedoresPrueba).indexOf(nombre);
                            int cambio = Integer.parseInt(articulos) + Integer.parseInt(Arrays.asList(numero_articulosPrueba).get(posicionUsuario));
                            Arrays.asList(numero_articulosPrueba).set(posicionUsuario, String.valueOf(cambio));
                        }
                        if (variador.contains("reducir")) {
                            int posicionUsuario = Arrays.asList(proveedoresPrueba).indexOf(nombre);
                            int cambio = Integer.parseInt(Arrays.asList(numero_articulosPrueba).get(posicionUsuario)) - Integer.parseInt(articulos);

                            if (cambio >= 0) {
                                Arrays.asList(numero_articulosPrueba).set(posicionUsuario, String.valueOf(cambio));
                            } else {
                                System.out.println("\n No se aceptan cambios negativos, intente de nuevo\n");
                            }
                        }
                    } else {
                        System.out.print("El usuario que ingreso no existe\n");
                    }
                    System.out.print("------Escribe de nuevo una opción------\n");
                    break;
                case 4:
                    System.out.print("Registra tu usuario \n\n");
                    System.out.print("Escribe tu nombre: ");
                    nombre = scan.nextLine();
                    proveedoresPrueba[userRegistrados] = nombre;

                    System.out.print("\nEscribe tu ciudad: ");
                    ciudad = scan.nextLine();
                    ciudadesPrueba[userRegistrados] = ciudad;

                    System.out.print("\nEscribe el numero de articulos que tienes: ");
                    articulos = scan.nextLine();
                    numero_articulosPrueba[userRegistrados] = articulos;
                    userRegistrados++;

                    System.out.print("------Escribe de nuevo una opción------\n");
                    break;
                case 5:
                    System.out.print("Escribe tu nombre: ");
                    nombre = scan.nextLine();
                    if (Arrays.asList(proveedoresPrueba).contains(nombre)) {
                        int posicionUsuario = Arrays.asList(proveedoresPrueba).indexOf(nombre);
                        proveedoresPrueba[posicionUsuario] = null;
                        ciudadesPrueba[posicionUsuario] = null;
                        numero_articulosPrueba[posicionUsuario] = null;

                        //Eliminar los nulos al ser eliminado el user

                        for (int i = 0; i < proveedoresPrueba.length; i++) {
                            if (proveedoresPrueba.length - 1 == i) {
                                if (proveedoresPrueba[i] == null || ciudadesPrueba[i] == null || numero_articulosPrueba[i] == null) {

                                    proveedoresPrueba[i] = proveedoresPrueba[proveedoresPrueba.length - 1];
                                    proveedoresPrueba[proveedoresPrueba.length - 1] = null;

                                    ciudadesPrueba[i] = ciudadesPrueba[proveedoresPrueba.length - 1];
                                    ciudadesPrueba[proveedoresPrueba.length - 1] = null;

                                    numero_articulosPrueba[i] = numero_articulosPrueba[proveedoresPrueba.length - 1];
                                    numero_articulosPrueba[proveedoresPrueba.length - 1] = null;
                                }
                            } else {
                                if (proveedoresPrueba[i] == null || ciudadesPrueba[i] == null || numero_articulosPrueba[i] == null) {

                                    proveedoresPrueba[i] = proveedoresPrueba[i + 1];
                                    proveedoresPrueba[i + 1] = null;

                                    ciudadesPrueba[i] = ciudadesPrueba[i + 1];
                                    ciudadesPrueba[i + 1] = null;

                                    numero_articulosPrueba[i] = numero_articulosPrueba[i + 1];
                                    numero_articulosPrueba[i + 1] = null;
                                }
                            }
                        }
                        //Ver los arrays impresos

                        /*for (int i = 0; i < proveedoresPrueba.length; i++) {
                            // Imprimimos los elementos del array en pantalla.
                            System.out.println(proveedoresPrueba[i] + "\n" + ciudadesPrueba[i] + "\n" + numero_articulosPrueba[i] + "\n");
                        }*/


                    } else {
                        System.out.print("El usuario que ingreso no existe\n");
                    }
                    System.out.print("------Escribe de nuevo una opción------\n");
                    break;
                case 6:
                    System.out.print("------PROGRAMA TERMINADO------");
                    pedirDatos = false;
                    break;
            }
        }
    }
}