package g.rivasurrego.com;

public class Recorrido extends Viaje implements IPrintable {
    private int cantMeses;

    public Recorrido(String codViaje, Double kilometraje, String puntoA, String puntoB, Integer cantPasajeros, int cantMeses) {
        super(codViaje, kilometraje, puntoA, puntoB, cantPasajeros);
        this.cantMeses = cantMeses;
    }



    @Override
    public Double calcCosto() {
        Double auxCostoRecorrido=(getKilometraje()*2)*(cantMeses*31);

        return auxCostoRecorrido;

        //Funcion Arrow
        // se debe leer el kilometraje y multiplicarlo por $2, obtener costo por dìa
        //multiplicar la cantidad de meses por 30,obtener la cantidad de dias
        //multiplicar el costo diario por la cantidad de dias
    }

    @Override
    public Double gastoGasolina() {
        return getKilometraje()*1.1;
        // se debe leer el kilometraje y multiplicarlo por 1.1ltro

    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }
}
