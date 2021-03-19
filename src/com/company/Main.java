package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Reto 2 Maria Isabel Cortes y Jhonny Galeano

            Punto1 tablasDeMultiplicar = new Punto1();
            Punto2 sumasDeImpares = new Punto2();
            Punto3 sumasDeNicomaco = new Punto3();
            Punto4 retirarDinero = new Punto4();
            Punto5 operacionFactorial =new Punto5();
            int numeroDeTablas;
            int numeroDeNEnteros;
            int numeroCubicos;
            double dineroARetirar;
            double numeroFactorialN,numeroFactorialM;

            numeroDeTablas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero hasta donde quiere que sean las tablas"));
            tablasDeMultiplicar.setMultiplicacion(numeroDeTablas);// primer punto

            numeroDeNEnteros = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero hasta donde se hara la sumatoria"));
            sumasDeImpares.SumasCubicas(numeroDeNEnteros); // segundo punto
            System.out.println("___________________________________________________________________________________");
            numeroCubicos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero hasta donde se hara la suma de nicómaco"));
            sumasDeNicomaco.NicomacoSumas(numeroCubicos);//tercer punto

            System.out.println("___________________________________________________________________________");
            dineroARetirar = Double.parseDouble(JOptionPane.showInputDialog("ingrese de dinero sin puntos y comas\n que desea retirar, recuerde \n no hay monedas inferiores a 50 pesos\n es un cajero con moneda COP"));
            retirarDinero.CajeroEuropeo(dineroARetirar);//cuarto punto

            System.out.println("_________________________________________________________________________");
            numeroFactorialN = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de factorial n: "));
            numeroFactorialM = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero de factorial m: "));
            operacionFactorial.Factorial(numeroFactorialN,numeroFactorialM);





            }//main




}//public class






