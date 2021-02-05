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
            response = Integer.valueOf(sc.nextLine());

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

            System.out.println("El valor de la mudanza es "+mudanza.cotizacion());
            operacionTerminada=true;
     }while (!operacionTerminada);};

}

/*import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patinetLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "kare@mail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@mail.com"));


        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patinetLogged = p;
                        //showPatientMenu
                    }
                }
            }


        }while (!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}*/