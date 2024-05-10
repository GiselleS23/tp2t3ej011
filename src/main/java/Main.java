/* 11-Determine un algoritmo que ordene los números de menor a mayor de 10 números dados. Una vez finalizado el ordenamiento realice un algoritmo de búsqueda que determine si un valor dado fue ingresado en la lista.
Sacchetti Maria Giselle C2 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Ingrese 10 números:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();

        
        if (num1 > num2) { int temp = num1; num1 = num2; num2 = temp; }
        if (num2 > num3) { int temp = num2; num2 = num3; num3 = temp; }
        if (num3 > num4) { int temp = num3; num3 = num4; num4 = temp; }
        if (num4 > num5) { int temp = num4; num4 = num5; num5 = temp; }
        if (num5 > num6) { int temp = num5; num5 = num6; num6 = temp; }
        if (num6 > num7) { int temp = num6; num6 = num7; num7 = temp; }
        if (num7 > num8) { int temp = num7; num7 = num8; num8 = temp; }
        if (num8 > num9) { int temp = num8; num8 = num9; num9 = temp; }
        if (num9 > num10) { int temp = num9; num9 = num10; num10 = temp; }

        
        System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + num7 + ", " + num8 + ", " + num9 + ", " + num10);

        
        System.out.println("Ingrese un valor para buscar:");
        int valorBuscado = input.nextInt();

        boolean encontrado = false;

        if (valorBuscado == num1 || valorBuscado == num2 || valorBuscado == num3 || valorBuscado == num4 || valorBuscado == num5 || valorBuscado == num6 || valorBuscado == num7 || valorBuscado == num8 || valorBuscado == num9 || valorBuscado == num10) {
            encontrado = true;
        }

        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " está en la lista.");
        } else {
            System.out.println("El valor " + valorBuscado + " no está en la lista.");
        }

        input.close();
    }
}
