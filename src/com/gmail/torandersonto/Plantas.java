package com.gmail.torandersonto;

/**
 * Esta clase padre contiene las varaibles principales para el objeto planta, se crean objetos GET y SET
 * y un metodo que permite calcular los dias que trasncurren hasta que la planta alcanza 30 cm
 * @author Anderson Y. Torres Q. torandersonq@gmail.com
 * @version 1.0
 */

//Clase planta
public class Plantas {

    //Variables privadas nivel clase
    private String nombre;
    private double porcentaje;
    private double altura;
    private double alturaF;
    
    //Constructor vacio (por defecto)
    public Plantas() {
    }

    //Constructor con parametros para el objeto
    public Plantas(String nombre, double altura, double porcentaje, double alturaF) {
        this.nombre = nombre;
        this.altura = altura;
        this.porcentaje = porcentaje;
        this.alturaF = alturaF;
    }

    //Metodos GET y SET para variables de clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAlturaF() {
        return alturaF;
    }

    public void setAlturaF(double alturaF) {
        this.alturaF = alturaF;
    }

    //Metodo que calcula cuantos dias tarda una planta en alcanzar 30 cm
    public void calculoPlanta(){
        int dias = 0;
        while(altura <= alturaF){
            double crecimiento;
            crecimiento = altura * porcentaje;
            altura = altura + crecimiento;
            dias++;
        }
        System.out.println("La planta: " + nombre + ", " + "tiene una altura final de: "
                + altura + ", " + "y tardo " + dias + " dias en lograr esa altura.");
    }
}
