package com.gmail.torandersonto;

/**
 * Esta es la clase principal que se encaarga de crear los objetos y llamar los metodos
 * de la clase Planta padre para ejecutar el metodo de calculo y mostrar resultados
 * @author Anderson Y. Torres Q. torandersonq@gmail.com
 * @version 1.0
 */

//Inicio clase
public class PlantasAltura {

    //Metodo principal main
    public static void main(String[] args) {
         
        Plantas planta1 = new Plantas("Clementina",10,(0.01),30);
        Plantas planta2 = new Plantas("Crisis",20,(0.5/100),30);
        Plantas planta3 = new Plantas("Lucho",5,(5*0.5/100),30);
     
        planta1.calculoPlanta();
        planta2.calculoPlanta();
        planta3.calculoPlanta();
    }
}
