import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
         *  Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
         * 
         */
        Locale.setDefault(Locale.US); //Altera a localização do sistema pra que os dados sejam pegos com pontos
         //Variaveis
        String sellerName; // NOme do vendedor
        double sellerSalary; // salario do vendedor
        double sellerSales;  // valor vendido
        double totalSalary;  // salario total com a comissao
        double sellerComission = 0.15; //comissao do vendedor

         // ENtradas
        Scanner in = new Scanner(System.in);
        sellerName = in.next();
        sellerSalary = in.nextDouble();
        sellerSales = in.nextDouble();

        //calculo do salario com base na comissao
        totalSalary = sellerSalary + (sellerSales *  sellerComission);

        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
        in.close();
    }
}
