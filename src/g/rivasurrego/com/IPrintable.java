package g.rivasurrego.com;

public interface IPrintable {
    static final Double PRECIO_GASOLINA=0.75;

    public default String cotizacion() {
     return "El costo total del servicio es: $"+(calcCosto()+calcCostoGasolina());
    }

        //Imprimir el codigo del viaje, el punto A, el punto B, cantidad de pasajeros, costo del viaje.

    public Double calcCosto();
    public default String getStringCosto() {
        return "el costo del servicio es: $"+calcCosto();
    }
    public Double gastoGasolina();
    public default String getStringGastoGasolina() {
        return "el gasto de gasolina es: lt"+gastoGasolina();
    }
    public default Double calcCostoGasolina() {
        return gastoGasolina()*PRECIO_GASOLINA;
    }
    }
