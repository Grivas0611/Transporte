package g.rivasurrego.com;

public class Vehiculo {
   private String placa;
   private String modelo;
   private String año;
   private String  color;

    public Vehiculo(String placa, String modelo, String año, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
