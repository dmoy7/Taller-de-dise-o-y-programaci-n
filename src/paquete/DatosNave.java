package paquete;
import java.util.Scanner;

/*
 * Clase que implementa la interfaz IVehiculoEstelar, y su finalidad es recopilar datos de la nave y su propietario.
 */

public class DatosNave implements IVehiculoEstelar {
    
    /*
     * Atributos de la clase 
     */

    public String nombreNave;
    private int identNave;
    private String propietarioNave;

    
    /*
     * Método para indicar el nombre de la nave.
     */
    @Override
    public String nombreNave(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" \n Ingrese el nombre de la nave");
        nombreNave=leer.nextLine();  
    return nombreNave;
    }

    /*
     * Método para indicar el codigo de identificación a la nave.
     */
    @Override
    public int identificacionNave(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" \n Ingrese un número de 4 digitos para el número de identificación de su nave");
        identNave=leer.nextInt();  
    return identNave;
    }

    /*
     * Método para indicar el nombre del propietario de la nave.
     */
    @Override
    public String propietarioNave(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" \n Ingrese el nombre del propietario de la nave");
        propietarioNave=leer.nextLine();  
    return propietarioNave;
    }    
}
