package aplicacion;

import dominio.Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca el numero del que quiera calcular el factorial");
        num = sc.nextInt();
        System.out.print(Ejercicio2.fac(num));
    }
}
