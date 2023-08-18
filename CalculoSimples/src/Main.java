
/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        //VARIAVEIS
       /*  int partOneCode;
        int partOneQuantity;
        double partOneValue;

        int partTwoCode;
        int partTwoQuantity;
        double partTwoValue;

        double totalValue; */

        //muda a data
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int codPeca1 = input.nextInt();
        int qntPeca1 = input.nextInt();
        double valorPeca1 = input.nextDouble();

         int codPeca2 = input.nextInt();
        int qntPeca2 = input.nextInt();
        double valorPeca2 = input.nextDouble();

        double custoTotal = qntPeca1 * valorPeca1 + qntPeca2 * valorPeca2;



        System.out.printf("VALOR A PAGAR: R$ %.2f\n", custoTotal);
        
        input.close();

        //=== PRIMEIRA FORMA ===
       /* String [] input; // array que guarda todas as entradas passadas em uma string
        Scanner in = new Scanner(System.in);
    
        input = in.nextLine().split(" ");
        partOneCode = Integer.parseInt(input[0]);
        partOneQuantity = Integer.parseInt(input[1]);
        partOneValue = Double.parseDouble(input[2]);

        input = in.nextLine().split(" ");
        partTwoCode = Integer.parseInt(input[0]);
        partTwoQuantity = Integer.parseInt(input[1]);
        partTwoValue = Double.parseDouble(input[2]);

        totalValue = partOneQuantity * partOneValue + partTwoQuantity * partTwoValue;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue); 

        in.close();*/
    }
}
