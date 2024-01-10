package com.exerciciosuri.gastocombustivel;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale(System);

        //Declaração
        Scanner in = new Scanner(System.in);
        int tempoGasto, velocidadeMedia;
        float combustivelGasto;

        //entradas
        tempoGasto = in.nextInt();
        velocidadeMedia = in.nextInt();
        in.close();

        //calculo
        combustivelGasto = ((float)(tempoGasto * velocidadeMedia)) / 12;

        System.out.printf("%.3f%n", combustivelGasto);
    }   
}
