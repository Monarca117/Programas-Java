/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanagrafica;
import javax.swing.JOptionPane;

/**
 * @author MAAJ
 * @version 30/08/2023
 */
public class VentanaGrafica 
{
    public static void main(String[] args) 
    {
        //Variables
        String nombre;
        int edad;
        char sexo;
        float estatura;
        
        //Bienvenida
        JOptionPane.showMessageDialog(null, "¡Bienvenido al registro de alumnos!");
        
        //Entrada de datos
        JOptionPane.showMessageDialog(null, "A continuación introduzca los datos del alumno al que va a aprobar con 10");
        nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del alumno"));
        sexo = JOptionPane.showInputDialog("Introduzca el sexo del alumno (F o M)").charAt(0);
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la estatura del alumno"));
        
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El alumno excentado es: " + nombre);
        JOptionPane.showMessageDialog(null, "¡ALTO AHÍ!");
        nombre = JOptionPane.showInputDialog("Ahora introduzca el nombre de su alumno favorito");
        JOptionPane.showMessageDialog(null, "Bien hecho, hasta luego");
        
        
    }
}
