package g.rivasurrego.com;

import java.time.LocalDate;

public class Sedan extends Vehiculo{
         private String tipoSedan;

    public Sedan(String placa, String modelo, LocalDate año, String color, String tipoSedan) {
        super(placa, modelo, año, color);

    }

    public String calcularTipoSedan() throws Exception {

        if ((LocalDate.now().getYear()-this.getAño().getYear())<3) {

            tipoSedan="A";
            System.out.println ("Sedan tipo A");
            return getTipoSedan();

        }

        else if ((LocalDate.now().getYear()-this.getAño().getYear())<6) {

            tipoSedan="B";
            System.out.println ("Sedan tipo B");
            return getTipoSedan();
        }

        else if ((LocalDate.now().getYear()-this.getAño().getYear())<9) {

            tipoSedan="C";
            System.out.println ("Sedan tipo C");
            return getTipoSedan();
        }

        else {

           System.out.println ("El auto es más antiguo de lo permitido");
            throw new Exception("El auto es más antiguo de lo permitido");
        }

    }


    public String getTipoSedan(){
        return tipoSedan;
    }

    public void setTipoSedan(String tipoSedan) {
        this.tipoSedan = tipoSedan;
    }
}
