package Rodríguez;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca un número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca un número: ");
        num2 = teclado.nextInt();
        System.out.println("Holaaaa");

        if (num1 > num2) {

            int suma, resta;
            suma = num1 + num2;
            System.out.println("La suma de los dos numeros es " + suma);
            resta = num1 - num2;
            System.out.println("La resta de los dos numeros es " + resta);

        } else {

            int producto, division;
            producto = num1 * num2;
            System.out.println("El producto de los dos numeros es " + producto);
            division = num1 / num2;
            System.out.println("La division de los dos numeros es " + division);

        }
    }
}
