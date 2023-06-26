import java.util.Scanner;

public class CalculadoraPerro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor introduzca la edad de su perro en años humanos: ");
        Integer anosHumanos = input.nextInt();


        Integer anosPerro = anosHumanos * 7;
        System.out.println("La edad de su perro en 'Años de Perro'  es: " + anosPerro);

    }
}
