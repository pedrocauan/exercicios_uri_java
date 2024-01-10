package com.exerciciosuri.distancia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia;
        int result;  
        // 60 min - 30 km
        // x   -   distancia

        //ENTRADAS
        distancia = scanner.nextInt();
        scanner.close();

        //CALCULO DA REGRA DE TRES
        result = distancia * 60 / 30 ;

        //SAÍDA
        System.out.println(result + " minutos");
        /*

Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade 
constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X,
 ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar 
essa distância do outro carro.
 */
    }
}