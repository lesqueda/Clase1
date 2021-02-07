/**
 * Operadores Aritméticos
 * = <- Asignación
 * - Resta
 * + Suma / concatenación
 * *
 * /
 * %
 *
 * Operadores aritméticos incrementales
 * ++ <- Sumar 1
 * -- <- restar 1
 *
 * Operadores aritméticos combinados
 * += <- a = a + b
 * -=
 * *=
 * /=
 * %=
 *
 * Operadores relacionales
 * == <- igualdad
 * != <- distinto a != b
 * <
 * >
 * <=
 * >=
 *
 * Operadores Lógicos
 * ! <- Negación
 * | <- Suma Lógica
 * ^ <- xor
 * &
 * || <- true & true
 *
 * */

package com.leonardo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int dato1, dato2, res=0;
        int op;

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Mult");
        System.out.println("4. Div");

        System.out.println("Ingrese el número de la operación");
        op = scan.nextInt();

        System.out.println("Ingrese el dato 1");
        dato1 = scan.nextInt();
        System.out.println("Ingrese el dato 2");
        dato2 = scan.nextInt();

        switch (op){
            case 1:
                res = dato1 + dato2;
                break;

            case 2:
                res = dato1 - dato2;
                break;

            case 3:
                res = dato1 * dato2;
                break;
            case 4:
                res = dato1 / dato2;
                break;

            default:
                System.out.println("Ingrese un valor válido");
                break;
        }

        System.out.println("El resultado es: " + res);

    }
}
