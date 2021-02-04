package g.rivasurrego.com;

public class Turismo extends Viaje implements IPrintable{

    public Turismo(String codViaje, Double kilometraje, String puntoA, String puntoB, Integer cantPasajeros) {
        super(codViaje, kilometraje, puntoA, puntoB, cantPasajeros);
    }

    @Override
    public Double calcCosto() {
        return getKilometraje()*7;
        //multiplicar kilometraje por 7$

    }

    @Override
    public Double gastoGasolina() {
        return getKilometraje()*3;
        //calcular kilometraje por 3lt
    }




}
