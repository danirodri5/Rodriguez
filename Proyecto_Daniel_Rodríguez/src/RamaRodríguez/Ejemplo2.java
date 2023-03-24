package RamaRodríguez;

public class Ejemplo2 {
    public static void main(String[] args) {

        String cadena1;
        System.out.println("Introduzca el valor de la primera cadena: ");
        cadena1 = System.console().readLine();

        String cadena2;
        System.out.println("Introduzca el valor de la segunda cadena: ");
        cadena2 = System.console().readLine();
        System.out.println("");

        System.out.println(cadena1.equals(cadena2));

        if (cadena1.equals(cadena2)) {
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("Ambas cadenas son diferentes");
        }
        System.out.println("");

        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Ambas cadenas son iguales, teniendo en cuenta mayúsculas y minúsculas");
        } else {
            System.out.println("Ambas cadenas son diferentes, teniendo en cuenta mayúsculas y minúsculas");
        }
        System.out.println("");

        System.out.println(cadena1.compareTo(cadena2));
        int s = (cadena1.compareTo(cadena2));

        if (s >= 0) {
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("Ambas cadenas son diferentes");
        }
        System.out.println("");

    }
}

