/*Clase # 6 del bootcamp - Datos primitivos y el bucle While*/

import java.util.Scanner;

public class ElijeAventura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

        int opcionSelecionada = input.nextInt();

        if (opcionSelecionada == 1) {
            System.out.println("Vas caminando por la oscuridad, y te caes a un pozo");
        }

        if (opcionSelecionada == 2) {
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. " +
                    "Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n");
            opcionSelecionada = input.nextInt();
            if (opcionSelecionada == 1) {
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena \n" +
                        "de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que \n" +
                        "llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.\n" +
                        "Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble \n" +
                        "aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\n");
            } else {
                System.out.println("Entras por la puerta derecha y caes en una trampa. FIN");
            }
        }


    }

}
