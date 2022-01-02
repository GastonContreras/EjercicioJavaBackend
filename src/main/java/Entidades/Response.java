package Entidades;

public class Response {
    private double tasa;

    private String mensaje;

    public Response() {
    }

    public Response(double tasa, String mensaje) {
        this.tasa = tasa;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
}
