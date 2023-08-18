import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula
         *  o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         * 
         */

        //declaração
        Scanner in = new Scanner(System.in);
        int personNumber;
        int hourJob;
        double hourValue;
        double salary = 0;
        
        //ENtradas
        personNumber = Integer.parseInt(in.nextLine());
        hourJob = Integer.parseInt(in.nextLine());
        hourValue = Double.parseDouble(in.nextLine());

        //Calcula salário
        salary = hourJob * hourValue;

        System.out.printf("NUMBER = %d\n", personNumber);
        System.out.printf("SALARY = U$ %.2f", salary);

    }
}
