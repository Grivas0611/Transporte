package g.rivasurrego.com;

import java.time.LocalDate;

public class Van extends Vehiculo{
    private Integer cantPuertas;
    private Integer capacidadMax;

    public Van(String placa, String modelo, LocalDate año, String color, Integer cantPuertas, Integer capacidadMax) {
        super(placa, modelo, año, color);
        this.cantPuertas = cantPuertas;
        this.capacidadMax = capacidadMax;
    }



    @Override
    public String toString() {
        return "Placa: " + getPlaca() + "Modelo: " + getModelo() +
                " Año: " + getAño() + "Color: " + getColor() + '\''+
                "Cantidad de Puertas:"+getCantPuertas()+"Capacidad Máx Pasajeros:  "+getCapacidadMax();
    }

    public Integer getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(Integer cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Integer getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(Integer capacidadMax) {
        this.capacidadMax = capacidadMax;
    }


}
