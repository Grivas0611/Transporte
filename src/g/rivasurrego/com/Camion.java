package g.rivasurrego.com;

public class Camion extends Vehiculo{
    private String tipoCamion;

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public Camion(String placa, String modelo, String año, String color, String tipoCamion) {
        super(placa, modelo, año, color);
        this.tipoCamion = tipoCamion;


    }
}
