import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {

//Hacer un programa que permita al usuario ingresar//numeros y //mostrarlos
        int[] numeros= new int[5];
        Scanner teclado = new Scanner(System.in);


        // Vamos a utilizar el bucle for
        int contador = 0;
        int suma = 0;
        for( contador = 0; contador < numeros.length; contador ++) {
            System.out.println("Ingrese un numero:");
            int numero = teclado.nextInt();
            numeros[contador]=numero;

        }







        // Vamos a utilizar el do while

     /*   int contador = 0;
        do {
            System.out.println("Ingrese un numero:");
            int numero = teclado.nextInt();
            numeros[contador]=numero;
            contador ++;

        } while (contador < numeros.length);*/



        /*   while (contador < numeros.length ){
            System.out.println("Ingrese un numero:");
            int numero = teclado.nextInt();
            numeros[contador]=numero;
            contador ++;
        } */



      /*  contador = 0;
        while (contador < numeros.length ){
            System.out.print(numeros[contador]);
            contador ++;
        } */


        // Vamos a utilizar el do while
       /* System.out.println("Los numeros que usted ingreso, son:");
        int contador = 0;
        do {
            System.out.print(numeros[contador]);
            contador ++;

        } while (contador < numeros.length);*/



        // Vamos a utilizar el ciclo for

        System.out.println("Los numeros que usted ha ingresado son:");
        for (contador =0; contador < numeros.length; contador ++){
            System.out.print(numeros[contador]);
        }


        int mayor =0;
        int menor =0;

        for (contador =0; contador < numeros.length; contador ++){
            int num = numeros[contador];
            if (num >= mayor || contador ==0) {
                mayor = num;
            }

            if (num <= menor  || contador ==0) {
                menor = num;
            }

        }
        System.out.println("\nNumero mayor es: "+ mayor);
        System.out.println("Numero menor: "+ menor);


        for (contador  =0; contador < numeros.length; contador ++){
           suma = suma + numeros[contador];
        }
        System.out.println("El promedio es: " + (float)suma / numeros.length );


    }
}