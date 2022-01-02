package Entidades;

import Servicios.TarjetaServicio;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TarjetaTest {

    @Test
    public void testImporteValido(){
        TarjetaServicio servicio = new TarjetaServicio();
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,"VISA", LocalDate.of(2023,12,1));
        assertTrue(servicio.esImporteValido(200) && !(servicio.esImporteValido(1100)));
    }
    @Test
    public void testTarjetasIguales(){
        boolean test = false;
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,"VISA", LocalDate.of(2023,12,1));
        Tarjeta tarjeta2 = new Tarjeta("Gaston Contreras",321,"VISA",LocalDate.of(2020,9,5));
        TarjetaServicio servicio = new TarjetaServicio();
        if(servicio.sonTarjetasIguales(tarjeta1,tarjeta1) && !(servicio.sonTarjetasIguales(tarjeta1,tarjeta2))){
            test = true;
        }
        assertTrue(test);
    }
    @Test
    public void testTarjetaVencida(){
        TarjetaServicio servicio = new TarjetaServicio();
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,"VISA", LocalDate.of(2023,12,1));
        Tarjeta tarjeta2 = new Tarjeta("Gaston Contreras",321,"VISA",LocalDate.of(2020,9,5));
        assertTrue(servicio.esTarjetaValida(tarjeta1) && !(servicio.esTarjetaValida(tarjeta2)));
    }
    @Test
    public void testCalcularTasa(){
        LocalDate fechaActual = LocalDate.now();
        TarjetaServicio servicio = new TarjetaServicio();
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,"VISA", LocalDate.of(2023,12,1));
        double tasa = servicio.tasaOperacion(tarjeta1.getMarca(), 100.0);
        //Tengo que hacer esto ya que el resultado esperado varia segun la fecha
        double tasaEsperada = ((double)fechaActual.getYear()-2000) / fechaActual.getMonthValue();
        if(tasaEsperada > 5) { tasaEsperada = 5; }
        if(tasaEsperada < 0.3 && tasa != 0) { tasaEsperada = 0.3; }
        //Como el monto es 100 entonces el % de la tasa es lo mismo que el valor de la tasa de la operacion
        assertEquals(tasaEsperada, tasa);
    }
}