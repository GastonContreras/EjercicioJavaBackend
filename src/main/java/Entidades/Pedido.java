package Entidades;

public class Pedido {
    private String marca;

    private double importe;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "marca='" + marca + '\'' +
                ", importe=" + importe +
                '}';
    }
}
