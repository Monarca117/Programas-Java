/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ternario;
import java.util.Scanner;

/**
 *@version 11/09/2023
 * @author Miguel Angel Arellano Juárez
 */
public class Ternario
{
    public static void main(String[] args)
	{
		Scanner dato = new Scanner(System.in);
		int num1, num2, mayor;
                
                //Petición de datos
                System.out.println("\t==== Comparacción de dos numeros ====");
                System.out.println("Dame el primer número");
                num1 = dato.nextInt();
                System.out.println("Dame el segundo número");
                num2 = dato.nextInt();
                
                //Condicionante
                /*if (num1 > num2)
                {
                    mayor = num1;
                }
                else
                {
                    mayor = num2;
                }*/
                
                //Ternario
                mayor = (num1 > num2)? num1: num2;
                
                //Impresión de número mayor
                System.out.println("El número mayor es: " + mayor);
	}
}