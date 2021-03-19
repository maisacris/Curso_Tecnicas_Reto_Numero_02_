package com.company;

import javax.swing.*;

public class Punto4 {

    public void CajeroEuropeo(double cantidadRetiro)
    {
        double billete100k =0, billete50k=0, billete20k=0, billete10k=0, billete5k=0, billete2k=0,billete1k=0;
        double moneda5h=0,moneda2h=0,moneda1h=0,moneda50=0;
        double cantidad;
        double limiteDeRetiro =300000;


        if(cantidadRetiro <= limiteDeRetiro) {
            System.out.println("la cantidad total es: "+ cantidadRetiro);
            while(cantidadRetiro>100000){
                billete100k++;
                cantidadRetiro = cantidadRetiro -100000;

            }

            while(cantidadRetiro>=50000){
                billete50k++;
                cantidadRetiro = cantidadRetiro-50000;

            }
            while(cantidadRetiro>20000){
                billete20k++;
                cantidadRetiro = cantidadRetiro -20000;

            }

            while(cantidadRetiro>=10000){
                billete10k++;
                cantidadRetiro = cantidadRetiro-10000;

            }
            while(cantidadRetiro>5000){
                billete5k++;
                cantidadRetiro = cantidadRetiro -5000;

            }

            while(cantidadRetiro>=2000){
                billete2k++;
                cantidadRetiro = cantidadRetiro-2000;

            }
            while(cantidadRetiro>1000){
                billete1k++;
                cantidadRetiro = cantidadRetiro -1000;

            }

            while(cantidadRetiro>=500){
                moneda5h++;
                cantidadRetiro = cantidadRetiro-500;

            }
            while(cantidadRetiro>200){
                moneda2h++;
                cantidadRetiro = cantidadRetiro -200;

            }

            while(cantidadRetiro>=100){
                moneda1h++;
                cantidadRetiro = cantidadRetiro-100;

            }
            while(cantidadRetiro>=50)
            {
                moneda50++;
                cantidadRetiro = cantidadRetiro -50;

            }


            System.out.println("se da "+billete100k+ " billetes de 100k");
            System.out.println("se da "+billete50k+" billetes de 50k");
            System.out.println("se da "+billete20k+" billetes de 20k");
            System.out.println("se da "+billete10k+" billetes de 10k");
            System.out.println("se da "+billete5k+" billetes de 5k");
            System.out.println("se da "+billete2k+" billetes de 2k");
            System.out.println("se da "+billete1k+" billetes de 1K");
            System.out.println("se da "+moneda5h+" monedas de 500");
            System.out.println("se da "+moneda2h+" monedas de 200");
            System.out.println("se da "+moneda1h+" monedas de 100");
            System.out.println("se da "+moneda50+" monedas de 50");


        }

        else{
            System.out.println("solamente puede retirar 300000$ por vez");
            }



    }//metodo
}//class
