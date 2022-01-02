package Servicios;

import Entidades.Tarjeta;

import java.time.LocalDate;

public class TarjetaServicio {

    public boolean esOperacionValida(Tarjeta usuario, double monto){
        return esImporteValido(monto) && esTarjetaValida(usuario);
    }

    public boolean esImporteValido(double monto) {
        if (monto < 1000) {
            return true;
        } else
            return false;
    }

    public boolean esTarjetaValida(Tarjeta tarjeta) {
        LocalDate fechaActual = LocalDate.now();
        if(tarjeta.getFechaDeVencimiento().compareTo(fechaActual)>0){
        return true;
        }
        else return false;
    }

    public boolean sonTarjetasIguales(Tarjeta t1, Tarjeta t2) {
        if (t1 == t2) {
            return true;
        } else return false;
    }

    public double tasaOperacion(String marca, double monto) {
        LocalDate fechaActual = LocalDate.now();
        double tasa;
        switch (marca) {
            case "VISA":
                tasa = ((double)fechaActual.getYear()-2000) / fechaActual.getMonthValue();
                break;
            case "AMEX":
                tasa = fechaActual.getDayOfMonth() * 0.5;
                break;
            case "NARA":
                tasa = fechaActual.getMonthValue() * 0.1;
                break;
            default:
                tasa = 0;
                System.out.println("La marca de la tarjeta es incorrecta.");
        }
        //Arreglo la variable tasa para que este entre 0.3% y 5%
        if(tasa > 5) { tasa = 5; }
        if(tasa < 0.3 && tasa != 0) { tasa = 0.3; }
        //calculo la tasa de la operacion
        tasa = monto * 0.01 * tasa;
        return tasa;
    }
}


