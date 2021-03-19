package com.company;

public class Punto3 {

    static void NicomacoSumas(int nEnteros){
          int n2,exponente =3, i3;
            double sumaDeEnteros;

            for(n2 =1; n2 <= nEnteros; n2++) {
                sumaDeEnteros = Math.pow(n2, exponente);
                System.out.println("la suma de " + n2 + " primeros enteros en cubos de Nicómaco es: " + sumaDeEnteros);
            }
    }
}
