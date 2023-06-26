import java.util.Random;
import java.util.Scanner;

public class JuegoAzar {

    public static void main(String[] args) {
        Random rand = new Random();

        // Aquí generamos un número aleatorio entre 1 y 100.
        // La función nextInt(100) genera un número entre 0 y 99, por lo que sumamos 1 para obtener un número entre 1 y 100.
        int numSelecionado = rand.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Pruebe su suerte . Adivine el numero entre 1 y 100: ");
        Integer numusuario = input.nextInt();

        if (numSelecionado == numusuario) {
            System.out.println("¡Felicidades! Adivinaste el número correctamente.");

        } else {

            System.out.println("Lo siento, no has adivinado el número. El número era: " + numSelecionado);

        }
    }
}
