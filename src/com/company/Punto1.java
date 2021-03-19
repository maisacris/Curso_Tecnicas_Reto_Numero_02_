package com.company;

public class Punto1 {


        public void setMultiplicacion ( int numeroDeTablas){

            int n = 1;
            int j ;
            int m = 0;
            int i;
            int numeroDeTablaJ;

            numeroDeTablaJ = 10;
            int multiplicacion;

            for(i = 0; i < numeroDeTablas; i++){

                for(j=0; j <= numeroDeTablaJ; j++){
                    multiplicacion = m*n;

                    System.out.println(n + "X" + m +"=" + multiplicacion);
                    m = m + 1;

                }
                System.out.println("____________________________");
                n = n +1;
                m = 0;
            }
        }

}


