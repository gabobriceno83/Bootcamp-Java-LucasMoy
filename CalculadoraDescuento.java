import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDescuento {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar el precio original del producto:");
        double precioOriginal = input.nextDouble();
        System.out.println("Ingresar el porcentaje del descuento:");
        double descuentoPorcentaje = input.nextDouble();


        double precioFinal = precioOriginal - (precioOriginal * descuentoPorcentaje / 100);
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(precioFinal);
        System.out.println(" Precio final con descuento: " + formatted);


    }


}
