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
