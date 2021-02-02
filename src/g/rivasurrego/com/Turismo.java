package g.rivasurrego.com;

public class Turismo extends Viaje{

    public Turismo(String codViaje, double kilometraje, String puntoA, String puntoB, Integer cantPasajeros) {
        super(codViaje, kilometraje, puntoA, puntoB, cantPasajeros);
    }

    @Override
    public void calcCosto() {
        //multiplicar kilometraje por 7$

    }

    @Override
    public void gastoGasolina() {

        //calcular kilometraje por 3lt
    }




}
