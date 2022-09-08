package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
         * Instancias 
         */
        
        crearNave c = new crearNave();
        DatosNave d = new DatosNave();
        Scanner objsc = new Scanner(System.in);
        int seguir = 8;
        /*
         * Metodos utilizados
         */
        while (seguir == 8){
            c.elegirNave();
            c.elegirCombustible();
            c.elegirColor();
            System.out.println(" \n Datos Guardados: " + c.DataTipoNave());
            System.out.println(" \n Datos Guardados: " + c.DataTipoCombustible());
            System.out.println(" \n Datos Guardados: " + c.DataTipoColor());
            System.out.println(" \n El nombre de su nave es: " + d.nombreNave());
            System.out.println(" \n El número de identificaión de su nave es: " + d.identificacionNave());
            System.out.println(" \n El nombre del propietario de la nave es: " + d.propietarioNave());
            System.out.println(" \n Presione 8 para crear otra nave o presione 9 para salir");
            seguir = objsc.nextInt();
        }
        
        
        
        
        
        
    }
}
