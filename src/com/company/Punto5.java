package com.company;

public class Punto5 {


    public static double Factorial(double nVeces,double mVeces)
    {
        double numNFaEscogido =1,numFaMEscogido =1;
        double operacion;
        double resta2,restaF=1;
            for(double i = 2;i<=nVeces;i++ )
            {
                numNFaEscogido = numNFaEscogido* i;
            }

            for(double j=2;j<=mVeces;j++)
            {
                numFaMEscogido = numFaMEscogido * j;
            }

            resta2 = nVeces - mVeces;

            for(double k =2; k <=resta2;k++)
            {
                restaF = restaF* k ;
            }

            operacion = numNFaEscogido/(numFaMEscogido*restaF);
            System.out.println("m! es: "+numFaMEscogido);
            System.out.println("n! es: "+numNFaEscogido);
            System.out.println("(n-m)! es: "+restaF);
            System.out.println("El resultado de la operacion es: "+operacion);


        return operacion;
    }
}
