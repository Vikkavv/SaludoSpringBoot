package com.example.demo;

public class Coche {
    private String marca;
    private String tipo;
    private String color;
    private String combustible;
    private int caballos;
    private double peso;

    public Coche(String marca, String tipo, String color, String combustible, int caballos, double peso) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.combustible = combustible;
        this.caballos = caballos;
        this.peso = peso;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
