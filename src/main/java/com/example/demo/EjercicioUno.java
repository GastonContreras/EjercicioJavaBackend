package com.example.demo;

import Entidades.Tarjeta;
import Servicios.TarjetaServicio;

import java.time.LocalDate;

public class EjercicioUno {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        TarjetaServicio servicio = new TarjetaServicio();
        //Creo 3 objetos de clase Tarjeta
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,1000.0,"VISA",LocalDate.of(2023,12,1));
        Tarjeta tarjeta2 = new Tarjeta("Gaston Contreras",321,1000.0,"VISA",LocalDate.of(2020,9,5));
        Tarjeta tarjeta3 = new Tarjeta("Gaston Contreras",213,1000.0,"VISA",LocalDate.of(2035,5,22));
        //Muestro una tarjeta
        System.out.println(tarjeta1.toString());
        //Me fijo si dos tarjetas con iguales
        servicio.sonTarjetasIguales(tarjeta1, tarjeta1);
        //Veo si la tarjeta esta vencida
        servicio.esTarjetaValida(tarjeta2);
    }

}