package g.rivasurrego.com;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ServicioVehiculo {

    public ArrayList<Camion> añadirCamiones() {
        ArrayList<Camion> camiones = new ArrayList<Camion>();
        camiones. add (new Camion("XYZ-123","Chevrolet", LocalDate.of(2021, Month.FEBRUARY,5), "blanco") );
        camiones.add (new Camion("XYZ-456", "Mazda", LocalDate.of(2019,6,11), "Rojo") );
        camiones.add (new Camion("XYZ-789", "Chevrolet", LocalDate.of(2015,8,6), "Azul") );
        return camiones;
    }

    public void verCamiones(ArrayList<Camion> camiones){
        for (int i = 0; i < camiones.size() ; i++)
            System.out.println("Datos del Camión: "+ camiones.toString());

    }
    public Van[]  añadirVans() {
        Van[] carVan= new Van[3];
        carVan[0]= new Van("DFG-123","Carry Van",LocalDate.of(2021,2,5),"Gris",
                2,11);
        carVan[1]= new Van("DFG-123","Carry Van",LocalDate.of(2021,2,5),"Gris",
                2,11);
        carVan[2]= new Van("DFG-123","Carry Van",LocalDate.of(2021,2,5),"Gris",
                2,11);
        return carVan;
    }
    public void verVans(Van[] carVan){
        for (int i = 0; i < carVan.length; i++)
            System.out.println("Datos de la Van "+ carVan[i].toString());
    }
}
// Crear el array para Sedan,3 tipos de carro