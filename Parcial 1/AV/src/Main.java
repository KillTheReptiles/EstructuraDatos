import upb.edu.co.list.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List vuelos = new List();
        List pasajeros = new List();

        Scanner scan = new Scanner(System.in);
        String nombre, apellido, telCont, idPasajero, direccion, tipoIdenti, categoriaPasa, nombreCont, apelliCont, direCont, pesoMale, telefono, numIdenti;
        int puesto, valorPasaje, numVuelo, idRegistro, idAvion;
        System.out.println("-----Bienvenido al sistema de AV-UPB-----");
        System.out.println("Selecciona una opción: \n" + "1. Ver vuelos y comprar ticket\n" + "2. Agente de abordaje\n" + "3. Salir");

        idRegistro = 0;

        boolean centi = true;
        while (centi) {
            String opcionBien = scan.nextLine();
            switch (opcionBien) {
                case "1" -> {//Ver vuelos y comprar ticket
                    List pasajero = new List();
                    System.out.println("Vuelos:\n" +
                            "Vuelo 1: Bucaramanga - Bogotá Hora Salida: 2:00pm Hora Llegada: 3:00pm Fecha: 5 de septiembre del 2020\n" +
                            "Vuelo 2: Bucaramanga - Cúcuta Hora Salida: 3:00pm Hora Llegada: 4:00pm Fecha: 6 de septiembre del 2020\n" +
                            "Vuelo 3: Bucaramanga - Bogotá Hora Salida: 4:00pm Hora Llegada: 5:00pm Fecha: 7 de septiembre del 2020\n" +
                            "Vuelo 4: Bucaramanga - Cúcutá Hora Salida: 5:00pm Hora Llegada: 6:00pm Fecha: 8 de septiembre del 2020\n" +
                            "Vuelo 5: Bucaramanga - Bogotá Hora Salida: 6:00am Hora Llegada: 7:00pm Fecha: 9 de septiembre del 2020\n" +
                            "Vuelo 6: Bucaramanga - Cúcuta Hora Salida: 7:00am Hora Llegada: 8:00pm Fecha: 10 de septiembre del 2020\n" +
                            "Vuelo 7: Bucaramanga - Bogotá Hora Salida: 8:00pm Hora Llegada: 9:00pm Fecha: 11 de septiembre del 2020\n" +
                            "Vuelo 8: Bucaramanga - Cúcuta Hora Salida: 9:00pm Hora Llegada: 10:00pm Fecha: 12 de septiembre del 2020\n" +
                            "Escriba el numero del vuelo para comprarlo: ");

                    //creando vuelos
                    for (int i = 1; i <= 8; i++) {
                        List vuelo = new List(); //numVUelo, ciudad salida, ciudad llegada, fecha salida, fecha llegada.
                        vuelo.add("Numero vuelo");
                        vuelo.add(i);
                        vuelo.add("ciudad salida");
                        vuelo.add("Bucaramanga");
                        vuelo.add("ciudad llegada");
                        if (i % 2 == 0) {
                            vuelo.add("Cúcuta");
                        } else {
                            vuelo.add("Bogotá");
                        }
                        vuelo.add("fecha salida");
                        Calendar calSalida = new GregorianCalendar(2020, Calendar.SEPTEMBER, i + 4, i + 13, 0, 0);
                        vuelo.add(calSalida);
                        vuelo.add("fecha llegada");
                        Calendar calLlegada = new GregorianCalendar(2020, Calendar.SEPTEMBER, i + 4, i + 14, 0, 0);
                        vuelo.add(calLlegada);

                        //add vuelo  a la lista vuelos
                        vuelos.add(vuelo);
                    }

                    numVuelo = Integer.parseInt(scan.nextLine());

                    idAvion = 0;
                    if (numVuelo == 1) {
                        idAvion = 123;
                    }
                    if (numVuelo == 2) {
                        idAvion = 1234;
                    }
                    if (numVuelo == 3) {
                        idAvion = 12345;
                    }
                    if (numVuelo == 4) {
                        idAvion = 1232;
                    }
                    if (numVuelo == 5) {
                        idAvion = 12341;
                    }

                    System.out.println("Ingrese la información del usuario que vuela");
                    System.out.println("Ingresar nombres: ");
                    nombre = scan.nextLine();
                    pasajero.add("nombre");
                    pasajero.add(nombre);
                    System.out.println("Ingresar apellidos: ");
                    apellido = scan.nextLine();
                    pasajero.add("apellido");
                    pasajero.add(apellido);
                    System.out.println("Ingresar tipo de identificacion: ");
                    tipoIdenti = scan.nextLine();
                    pasajero.add("tipoIdenti");
                    pasajero.add(tipoIdenti);
                    System.out.println("Ingresar numero de identificación: ");
                    numIdenti = scan.nextLine();
                    pasajero.add("numIdenti");
                    pasajero.add(numIdenti);
                    System.out.println("Ingresar dirección de residencia actual: ");
                    direccion = scan.nextLine();
                    pasajero.add("direccion");
                    pasajero.add(direccion);
                    System.out.println("Ingresar numero de telefono: ");
                    telefono = scan.nextLine();
                    pasajero.add("telefono");
                    pasajero.add(telefono);
                    idPasajero = numIdenti;
                    pasajero.add("idPasajero");
                    pasajero.add(idPasajero);
                    pesoMale = "none";
                    pasajero.add("pesoMale");
                    pasajero.add(pesoMale);
                    System.out.println("Que tipo de puesto desea\n" +
                            "1. Premium: 7.000.000\n" +
                            "2. Ejecutivo: 300.000\n" +
                            "3. Económico: 120.000");
                    int tipopues = Integer.parseInt(scan.nextLine());
                    if (tipopues == 1) {
                        categoriaPasa = "Premium";
                        pasajero.add("categoriaPasa");
                        pasajero.add(categoriaPasa);
                        valorPasaje = 7000000;
                        pasajero.add("valorPasaje");
                        pasajero.add(valorPasaje);
                    }
                    if (tipopues == 2) {
                        categoriaPasa = "Ejecutivo";
                        pasajero.add("categoriaPasa");
                        pasajero.add(categoriaPasa);
                        valorPasaje = 300000;
                        pasajero.add("valorPasaje");
                        pasajero.add(valorPasaje);
                    }
                    if (tipopues == 3) {
                        categoriaPasa = "Económico";
                        pasajero.add("categoriaPasa");
                        pasajero.add(categoriaPasa);
                        valorPasaje = 120000;
                        pasajero.add("valorPasaje");
                        pasajero.add(valorPasaje);
                    }
                    pasajero.add("idAvion");
                    pasajero.add(idAvion);
                    pasajero.add("numVuelo");
                    pasajero.add(numVuelo);
                    System.out.println("Solo hay puestos disponibles en un 50% debido al COVID-19");
                    if (pasajeros.isEmpty()) {
                        puesto = (int) (Math.random() * 72 + 1);
                        pasajero.add("puesto");
                        pasajero.add(puesto);
                        System.out.println("Su puesto es: " + puesto);
                    } else {
                        int llenoPuesto = 0;
                        for (ListNode node = pasajeros.head; node != null; node = node.next) {
                            List pasajeroN = (List) node.getObject();
                            for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                if (node2.getObject() == "puesto") {
                                    puesto = (int) (Math.random() * 72 + 1);
                                    if ((int) node2.next.getObject() == puesto) {
                                        ++llenoPuesto;
                                    } else {
                                        pasajero.add("puesto");
                                        pasajero.add(puesto);
                                        System.out.println("Su puesto es: " + puesto);
                                    }
                                    if (llenoPuesto == 72) {
                                        System.out.println("No hay puestos disponibles en este avión");
                                    }

                                }
                            }
                        }
                    }
                    //---------------------contacto info---------------------
                    System.out.println("\nIngresar información de persona de contacto: ");
                    System.out.println("Ingresar nombres: ");
                    nombreCont = scan.nextLine();
                    pasajero.add("nombreCont");
                    pasajero.add(nombreCont);
                    System.out.println("Ingresar apellidos: ");
                    apelliCont = scan.nextLine();
                    pasajero.add("apelliCont");
                    pasajero.add(apelliCont);
                    System.out.println("Ingresar dirección: ");
                    direCont = scan.nextLine();
                    pasajero.add("direCont");
                    pasajero.add(direCont);
                    System.out.println("Ingresar telefono: ");
                    telCont = scan.nextLine();
                    pasajero.add("telCont");
                    pasajero.add(telCont);
                    pasajeros.add(pasajero);
                    System.out.println("Gracias por usar el sistema");
                    pasajero.add("idRegistro");
                    pasajero.add(idRegistro);
                    ++idRegistro;
                    System.out.println("Estas en el menu principal, escribe una opción");
                    break;
                }
                case "2" -> {
                    System.out.println("Bienvenido al sistema del agente");

                    System.out.println("1. Cambiar datos\n" +
                            "2. Ver informacion del pasajero\n" +
                            "3. Generar reportes");
                    String opcion = scan.nextLine();
                    switch (opcion) {
                        case "1" -> {
                            System.out.println("Ingrese el numero de identificación del pasajero: ");
                            numIdenti = scan.nextLine();
                            for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                List pasajeroN = (List) node.getObject();
                                if (pasajeroN.contains(numIdenti)) {
                                    for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                        if (node2.getObject() == "numVuelo") {
                                            int numeroVuelo = (int) node2.next.getObject();
                                            ListNode node3 = vuelos.head;
                                            List vueloN = null;
                                            for (int i = 0; i < numeroVuelo; i++) {
                                                vueloN = (List) node3.getObject();
                                                node3 = node3.next;
                                            }
                                            for (ListNode node4 = vueloN.head; node4 != null; node4 = node4.next) {

                                                if (node4.getObject() == "fecha salida") {
                                                    Calendar horaActual = Calendar.getInstance();
                                                    Calendar horaSalida = (Calendar) node4.next.getObject();

                                                    long mins = (horaSalida.getTimeInMillis() - horaActual.getTimeInMillis()) / 60000;
                                                    if (mins < 30) {
                                                        System.out.println("Ya no puedes cambiar la información del pasajero");
                                                    } else {
                                                        System.out.println("Hay que tener cuidado con la información que se cambia");
                                                        Object datoMal = null;
                                                        if (pasajeros.head != null) {
                                                            System.out.println("Elija la opción para cambiar lo que desee: \n" +
                                                                    "0. Peso Maleta\n1. Nombre\n2. Apellido \n3. ID Registro\n4. ID Pasajero\n5. Numero Identificacion\n6. Dirección\n7. Telefono\n8. Puesto\n9. Categoria\n10. Nombre contacto\n11. Apellido Contacto\n12.Direccion contacto\n13. Telefono contacto");
                                                            int datoCambio = Integer.parseInt(scan.nextLine());
                                                            if (datoCambio == 0) {
                                                                datoMal = "pesoMale";
                                                                System.out.println("Recuerda que el peso maximo es de 52Kg");
                                                                System.out.println("Ingrese el peso en Kg");
                                                                int pesoMaleFinal = Integer.parseInt(scan.nextLine());
                                                                if (pesoMaleFinal <= 52 && pesoMaleFinal >= 0) {
                                                                    for (ListNode node5 = pasajeroN.head; node5 != null; node5 = node5.next) {
                                                                        if (node5.getObject() == "pesoMale") {
                                                                            pasajeroN.set(node5.next, pesoMaleFinal);
                                                                            System.out.println("Peso cambiado con exito");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (datoCambio == 1) {
                                                                datoMal = "nombre";
                                                            }
                                                            if (datoCambio == 2) {
                                                                datoMal = "apellido";
                                                            }
                                                            if (datoCambio == 3) {
                                                                datoMal = "idRegistro";
                                                            }
                                                            if (datoCambio == 4) {
                                                                datoMal = "idPasajero";
                                                            }
                                                            if (datoCambio == 5) {
                                                                datoMal = "numIdenti";
                                                            }
                                                            if (datoCambio == 6) {
                                                                datoMal = "direccion";
                                                            }
                                                            if (datoCambio == 7) {
                                                                datoMal = "telefono";
                                                            }
                                                            if (datoCambio == 8) {
                                                                datoMal = "puesto";
                                                            }
                                                            if (datoCambio == 9) {
                                                                datoMal = "categoria";
                                                            }
                                                            if (datoCambio == 10) {
                                                                datoMal = "nombreCont";
                                                            }
                                                            if (datoCambio == 11) {
                                                                datoMal = "apelliCont";
                                                            }
                                                            if (datoCambio == 12) {
                                                                datoMal = "direCont";
                                                            }
                                                            if (datoCambio == 13) {
                                                                datoMal = "telCont";
                                                            }
                                                            if (datoCambio != 0) {
                                                                System.out.println("Escriba el dato nuevo: ");
                                                                Object datoBien = scan.nextLine();
                                                                for (ListNode pasa = pasajeroN.head; pasa != null; pasa = pasa.next) {
                                                                    if (pasa.getObject() == datoMal) {
                                                                        pasajeroN.set(pasa.next, datoBien);
                                                                        System.out.println("El dato fue cambiado con exito");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }
                                } else {
                                    System.out.println("El pasajero con esta identificación no existe");
                                }
                            }
                            break;
                        }
                        case "2" -> {
                            System.out.println("Sistema de busqueda de usuario");
                            System.out.println("Ingrese el numero de identificación del pasajero: ");
                            numIdenti = scan.nextLine();
                            if (pasajeros.head != null) {
                                for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                    List pasajeroN = (List) node.getObject();
                                    if (pasajeroN.contains(numIdenti)) {
                                        System.out.println("Información del pasajero: ");
                                        for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                            System.out.println(node2.getObject());
                                        }
                                    } else {
                                        System.out.println("El pasajero con esta identificación no existe");
                                    }
                                }
                            } else {
                                System.out.println("No hay pasajeros registrados en el sistema");
                            }
                            break;
                        }
                        case "3" -> {
                            System.out.println("Bienvenido al generador de reportes\n" +
                                    "1. Generar reporte por orden de nombre, apellidos e id de avion\n" +
                                    "2. Generar reporte de costos totales");
                            int reporteOpcion = Integer.parseInt(scan.nextLine());
                            if (reporteOpcion == 1) {
                                System.out.println("Reporte ordenado por solo nombres: ");
                                for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                    List pasajeroN = (List) node.getObject();
                                    for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                        if (node2.getObject() == "nombre") {
                                            System.out.println(node2.next.getObject());
                                        }
                                    }
                                }
                                System.out.println("\nReporte ordenado por solo apellidos: ");
                                for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                    List pasajeroN = (List) node.getObject();
                                    for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                        if (node2.getObject() == "apellido") {
                                            System.out.println(node2.next.getObject());
                                        }
                                    }
                                }
                                System.out.println("\nReporte ordenado por solo id de avión: ");
                                for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                    List pasajeroN = (List) node.getObject();
                                    for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                        if (node2.getObject() == "idAvion") {
                                            System.out.println(node2.next.getObject());
                                        }
                                    }
                                }
                            }
                            if (reporteOpcion == 2) {
                                int costoTotal = 0;
                                nombre = null;
                                valorPasaje = 0;
                                for (ListNode node = pasajeros.head; node != null; node = node.next) {
                                    List pasajeroN = (List) node.getObject();
                                    for (ListNode node2 = pasajeroN.head; node2 != null; node2 = node2.next) {
                                        if (node2.getObject() == "nombre") {
                                            nombre = (String) node2.next.getObject();
                                        }
                                        if (node2.getObject() == "valorPasaje") {
                                            valorPasaje = (int) node2.next.getObject();
                                            costoTotal += (int) node2.next.getObject();
                                        }
                                    }
                                    System.out.println("Nombre: "+ nombre + "\nValor de su pasaje: "+valorPasaje);
                                }
                                System.out.println("El costo total de los vuelos es: " + costoTotal);
                            }
                            break;
                        }
                    }
                    System.out.println("Estas en el menu principal, escribe una opción");
                    break;
                }
                case "3" -> {
                    System.out.println("Ha salido del sistema");
                    centi = false;
                    break;
                }
            }

        }

    }
}