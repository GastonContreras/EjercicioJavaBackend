package Entidades;

import java.time.LocalDate;

public class Tarjeta {
    private String cardHolder;

    private int numeroDeTarjeta;

    private double saldo;

    private String marca;

    private LocalDate fechaDeVencimiento;

    public Tarjeta() {
    }

    public Tarjeta(String cardHolder, int numeroDeTarjeta, double saldo, String marca, LocalDate fechaDeVencimiento) {
        this.cardHolder = cardHolder;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldo = saldo;
        this.marca = marca;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(int numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "cardHolder='" + cardHolder + '\'' +
                ", numeroDeTarjeta=" + numeroDeTarjeta +
                ", saldo=" + saldo +
                ", marca='" + marca + '\'' +
                ", fechaDeVencimiento=" + fechaDeVencimiento +
                '}';
    }
}
