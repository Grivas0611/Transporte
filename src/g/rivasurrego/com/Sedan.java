package g.rivasurrego.com;

public class Sedan extends Vehiculo{


    public Sedan(String placa, String modelo, String año, String color, String tipoSedan) {
        super(placa, modelo, año, color);

    }

    public String tipoSedan() {
        return null;
    }

    //quisiera que leyera el año y determinara si es un sedan tipo A (dos años de antiguedad), tipo B (3 a 8 años de antiguedad
    // sedan tipo C de 9 a 13 años de antiguedad y si es más viejo no lo deje agregar


    public String getTipoSedan() {
        return tipoSedan;
    }

    public void setTipoSedan(String tipoSedan) {
        this.tipoSedan = tipoSedan;
    }
}
