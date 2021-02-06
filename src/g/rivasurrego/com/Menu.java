package g.rivasurrego.com;
import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("Bienvenido al Servicio de Transporte");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Mudanza");
            System.out.println("2. Recorrido");
            System.out.println("3. Turismo");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            String auxTextoScanner=sc.nextLine();
            Integer valorIngresado=0;
           try {
                valorIngresado=Integer.valueOf(auxTextoScanner);
            } catch (Exception e) {
                e.printStackTrace();
                valorIngresado=9;
            }
            response = valorIngresado;
          //  response= Integer.valueOf(auxTextoScanner);

            switch (response) {
                case 1:
                    System.out.println("Mudanza");
                    menuMudanza();
                    //response = 0;
                    break;
                case 2:
                    System.out.println("Recorrido");
                    response = 0;
                    break;
                case 3:
                    System.out.println("Turismo");
                    response = 0;
                    break;
                case 0:
                    System.out.println("Gracias por preferirnos");
                    break;
                default:
                    System.out.println("Seleccione una respuesta correcta");
            }
        } while (response != 0);
    }

     public static void menuMudanza(){
        boolean operacionTerminada=false;
        do {
         System.out.println("Ingrese el kilometraje, ejemplo: 10.5");
         Scanner sc = new Scanner(System.in);
        String kilometraje = sc.nextLine();
            System.out.println("Ingrese el punto A, ejemplo: Calle 26");
            String puntoA = sc.nextLine();
            System.out.println("Ingrese el punto B, ejemplo: Calle 12");
            String puntoB= sc.nextLine();
            System.out.println("Ingrese la cantidad de personas, ejemplo: 2");
            String cantPersonas = sc.nextLine();
            System.out.println("Ingrese la cantidad de kilogramos, ejemplo: 100");
            String cantKg = sc.nextLine();
            Mudanza mudanza = new Mudanza("", Double.valueOf(kilometraje),puntoA,puntoB,Integer.valueOf(cantPersonas),Double.valueOf(cantKg));

            System.out.println(mudanza.cotizacion());
            System.out.println("Camiones Disponibles");
            new ServicioVehiculo().verCamiones(new ServicioVehiculo().añadirCamiones());
            operacionTerminada=true;
     }while (!operacionTerminada);};

}
//Desarrollar menú turismo y recorrido, solicitar los datos para instanciar el objeto, mostrar el valor del servicio y los autos dispon