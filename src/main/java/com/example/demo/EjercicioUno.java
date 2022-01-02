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
        Tarjeta tarjeta1 = new Tarjeta("Gaston Contreras",123,"VISA",LocalDate.of(2023,12,1));
        Tarjeta tarjeta2 = new Tarjeta("Gaston Contreras",321,"VISA",LocalDate.of(2020,9,5));
        Tarjeta tarjeta3 = new Tarjeta("Gaston Contreras",213,"VISA",LocalDate.of(2035,5,22));
        //Muestro una tarjeta
        System.out.println(tarjeta1.toString());
        //Me fijo si una operacion es valida
        if(servicio.esImporteValido(200.0)){
            System.out.println("Es una operacion valida.");
        } else {
            System.out.println("No es una operacion valida");
        }
        //Me fijo si dos tarjetas con iguales
        if(servicio.sonTarjetasIguales(tarjeta1,tarjeta2)){
            System.out.println("Son tarjetas iguales.");
        } else {
            System.out.println("No son tarjetas iguales");
        }
        //Veo si la tarjeta esta vencida
        if(servicio.esTarjetaValida(tarjeta2)){
            System.out.println("La tarjeta no esta vencida.");
        } else {
            System.out.println("La tarjeta no esta vencida");
        }
        //Calculo la tasa de una operacion
        double tasa = servicio.tasaOperacion(tarjeta1.getMarca(), 500.0);
        if(tasa == 0){
            System.out.println("La marca de la tarjeta es invalida");
        } else {
            System.out.println("La tasa de la operacion es igual a: " + tasa);
        }
    }

}