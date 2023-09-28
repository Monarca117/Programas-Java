import java.util.Scanner;

public class Vacaciones
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            String name = "";
            int clave = 0, antiguedad = 0;

            //Bienvenida de CocaCola
            System.out.println("*******************************************************");
            System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
            System.out.println("*******************************************************");

            //Se le pide el nombre al trabajador
            System.out.println("¿Cual es tu nombre de trabajador?");
            name = in.nextLine();

            //Se le preguntan sus años de servicio
            System.out.println("¿Cuantos años de servicio posee?");
            antiguedad = in.nextInt();
            
            //Se le pide la clave de su departamento
            System.out.println("¿Cual es la clave de su departamento?");
            clave = in.nextInt();

            //Clave 1
            if(clave == 1)
            {
                if(antiguedad == 1)
                {
                    System.out.println(name + " tienes derecho a 6 dias");
                }else if(antiguedad >= 2 && antiguedad <= 6)
                {
                    System.out.println(name + " tienes derecho a 14 dias");
                }else if(antiguedad == 7)
                {
                    System.out.println(name + " tienes derecho a 20 dias");
                }else if(antiguedad >= 7)
                {
                    System.out.println(name + " mereces un ascenso amigo");
                }else if(antiguedad <= 0)
                {
                    System.out.println("Chistosito");
                }
            }else if(clave == 2)
            {
                if(antiguedad == 1)
                {
                    System.out.println(name + " tienes derecho a 7 dias");
                }else if(antiguedad >= 2 && antiguedad <= 6)
                {
                    System.out.println(name + " tienes derecho a 15 dias");
                }else if(antiguedad == 7)
                {
                    System.out.println(name + " tienes derecho a 22 dias");
                }else if(antiguedad >= 7)
                {
                    System.out.println(name + " mereces un ascenso amigo");
                }else if(antiguedad <= 0)
                {
                    System.out.println("Chistosito");
                }
            }else if(clave == 3)
            {
                if(antiguedad == 1)
                {
                    System.out.println(name + " tienes derecho a 10 dias");
                }else if(antiguedad >= 2 && antiguedad <= 6)
                {
                    System.out.println(name + " tienes derecho a 20 dias");
                }else if(antiguedad == 7)
                {
                    System.out.println(name + " tienes derecho a 30 dias");
                }else if(antiguedad >= 7)
                {
                    System.out.println(name + ", ¿Sigues siendo gerente?");
                }else if(antiguedad <= 0)
                {
                    System.out.println("Chistosito");
                }
            }else
            {
                System.out.println("Error");
            }
        }
    }    
}
