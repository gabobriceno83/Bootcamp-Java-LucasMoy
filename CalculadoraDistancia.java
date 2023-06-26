import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDistancia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor introduzca una distancia en Millas: ");
        double distanciaMillas = input.nextDouble();
        double distanciaKilometros = distanciaMillas * 1.60934;

        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(distanciaKilometros);
        System.out.println("La distancia en kilometros es: " + formatted+ "km");

    }

}
