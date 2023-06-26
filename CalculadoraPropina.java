import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraPropina {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar el total de la cuenta:");
        double totalCuenta = input.nextDouble();
        System.out.println("Ingresar el porcentaje de propina que desea dar:");
        double propinaPorcentaje = input.nextDouble();


        double montoPropina = totalCuenta * (propinaPorcentaje / 100);

        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(montoPropina);
        System.out.println("Monto de la propina : " + formatted);

    }
}