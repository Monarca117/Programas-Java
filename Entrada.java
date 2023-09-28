/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entrada;
import java.util.Scanner;

/*
 * @author MAAJ
 * @Version 23/08/2023
 */
public class Entrada 
{

    public static void main(String[] args) 
    {
        //Declara variables
        Scanner in = new Scanner(System.in);
        int numF = 0;
        
        //ENTRADA DE NÚMERO FAVORITO
        System.out.println("ENTRADA DE DATOS");
        System.out.println("Proporciona tu número de la suerte");
        numF = in.nextInt();
        
        //Impresion de Número Favorito
        System.out.println("Este es tu número favorito: " + numF);
    }
}
