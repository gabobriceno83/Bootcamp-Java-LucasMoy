/*Clase # 5 del bootcamp - Operadores y estructuras de control de flujo*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {

       // Calculo del IMC:  Peso en Kg/ Altura en mtr al cuadrado

        System.out.println("Ingrese su peso en Kg");
        Scanner cargaDeDatos = new Scanner(System.in);
        double peso = cargaDeDatos.nextDouble();
        System.out.println("Ingrese su altura en mts");
        double altura = cargaDeDatos.nextDouble();
        double imc = peso /(altura * altura);
        System.out.println("Tu indice de Masa Corporal es: "+ imc);



        //Mayor a 30 ---> Obesidad
        if (imc >= 30){
            System.out.println("Presentas Obesidad");
        }

        //Entre a 25 y  30 ---> Sobrepeso
        else if (imc >=25 && imc < 30) {
            System.out.println("Presentas Sobrepeso");
        }
        //Entre 18.5 y 25 ----> Normal
        else if (imc >=18.5 && imc < 25) {
            System.out.println("Presenta un peso normal ");
        }
        //Menor a 18.6 ------> Debajo de lo normal
        else if (imc < 18.6 ) {
            System.out.println("Presenta una falta de peso");
        }


















       /*
        System.out.println("¿Que edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();

        if (edad >=18) {
             System.out.println("Es mayor de edad");

        } else {
            System.out.println("Es menor de edad");

        }*/
    }
}
