package com.company;

public class Punto2 {

    static void SumasCubicas(int numerosPedidos){
        int sumaInicial = 0, numeroAgregado = 1, resultado, i2;

        for (i2=0; i2 < numerosPedidos; i2++){
            resultado = sumaInicial + numeroAgregado;
            sumaInicial = resultado;
            numeroAgregado = numeroAgregado + 2;
            System.out.println(resultado);
        }
    }



}
