package g.rivasurrego.com;
import java.time.LocalDate;
import java.util.ArrayList;

public class Camion extends Vehiculo{

        public Camion(String placa, String modelo, LocalDate año, String color) {
        super(placa, modelo, año, color);

    }

    @Override
    public String toString() {
        return "Placa: " + getPlaca() + "Modelo: " + getModelo() +
                " Año: " + getAño() + "Color: " + getColor() + '\'';
    }

}
