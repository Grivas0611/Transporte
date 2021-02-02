package g.rivasurrego.com;


public class Mudanza extends Viaje {
    private double kgCarga;

    @Override
    public void calcCosto() {
    // se debe leer el kilometraje y multiplicarlo por $5

    }

    @Override
    public void gastoGasolina() {
        // se debe leer el kilometraje y multiplicarlo por 1.2ltrs

    }

    public Mudanza(String codViaje, double kilometraje, String puntoA, String puntoB, Integer cantPasajeros, double kgCarga) {
        super(codViaje, kilometraje, puntoA, puntoB, cantPasajeros);
        this.kgCarga = kgCarga;
    }

    public double getKgCarga() {
        return kgCarga;
    }

    public void setKgCarga(double kgCarga) {
        this.kgCarga = kgCarga;
    }
}
