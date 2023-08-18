import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double radius, volume;
        final double PI = 3.14159;
        Locale.setDefault(Locale.US);
        //Entrada
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();
        
        // Calculo do volume da esféra
        volume = (4.0/ 3) * PI * Math.pow(radius, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
        in.close();

    }
}
