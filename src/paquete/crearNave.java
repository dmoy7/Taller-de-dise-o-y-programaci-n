package paquete;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * Clase que se extiende de la clase abstracta Nave y su finalidad es crear la nave
 */

public class crearNave extends Nave{
    /*
     * Atributos adicionales para crear sobrecargas
     */
    public int tipoColor;
    public ArrayList<Integer> data1 = new ArrayList<Integer>();

    /*
     * Método para que el usuario elija el tipo de nave
     */

    @Override
    public int elegirNave(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el tipo de nave: \n 1. Presione 1 para crear un Vehículo Lanzadera \n 2. Presione 2 para crear una nave espacial no tripulada \n 3. Presione 3 para crear una nave espacial tripulada \n 4. Presione 4 para crear una nave espacial con propulsores electromagnéticos");
        tipoNave=leer.nextInt();        

        switch (tipoNave){
            
            case 1:
            System.out.println("Usted eligió crear un vehículo lanzadera");
            break;
            
            case 2:
            System.out.println("Usted eligió crear una nave no tripulada");
            break;
            
            case 3:
            System.out.println("Usted eligió crear una nave tripulada");
            break;
            
            case 4:
            System.out.println("Usted eligió crear una nave con propulsores electromagnéticos");
            break;
            
            default:
            System.out.println("Parámetro no valido");
        }
        return tipoNave;
    }

    

    /*
     * Método para que el usuario elija el tipo de combustible que usará la nave
     */

    @Override
    public int elegirCombustible(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el tipo de combustible:");
        System.out.println("Presione 1 para elegir el Combustible Tipo 1");
        System.out.println("Presione 2 para elegir el Combustible Tipo 2");
        System.out.println("Presione 3 para elegir el Combustible Tipo 3");
        System.out.println("Presione 4 para elegir el Combustible Tipo 4");

        tipoCombustible=leer.nextInt();

        switch (tipoCombustible){
            
            case 1:
            System.out.println("Usted eligió crear una nave que utlizará el Combustible Tipo 1");
            break;
            
            case 2:
            System.out.println("Usted eligió crear una nave que utlizará el Combustible Tipo 2");
            break;
            
            case 3:
            System.out.println("Usted eligió crear una nave que utlizará el Combustible Tipo 3");
            break;
            
            case 4:
            System.out.println("Usted eligió crear una nave que utlizará el Combustible Tipo 4");
            break;
            
            default:
            System.out.println("Parámetro no valido");
        }

        return tipoCombustible;

    }
    
    
    /*
     * Método para que el usuario elija el de color para la nave (Sobrecarga)
     */

    public int elegirColor(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el tipo de color para su nave:");
        System.out.println("Presione 1 para elegir el color rojo");
        System.out.println("Presione 2 para elegir el color negro");
        System.out.println("Presione 3 para elegir el color blanco");
        System.out.println("Presione 4 para elegir el color azul");

        tipoColor=leer.nextInt();

        switch (tipoColor){
            
            case 1:
            System.out.println("Usted eligió crear una nave de color rojo");
            break;
            
            case 2:
            System.out.println("Usted eligió crear una nave de color negro");
            break;
            
            case 3:
            System.out.println("Usted eligió crear una nave de color blanco");
            break;
            
            case 4:
            System.out.println("Usted eligió crear una nave de color azul");
            break;
            
            default:
            System.out.println("Parámetro no valido");
        }
        return tipoColor;

    }

    /*
     * Método para guardar el tipo de nave en un arreglo
     */

    public ArrayList<Integer> DataTipoNave(){
        data1.add(tipoNave);
        int lastIdx1 = data1.size() - 1;
		int lastElement1 = data1.get(lastIdx1);
        

        if (lastElement1 == 1){
            System.out.print("\n Usted construyó una nave lanzadera que tendrá las siguientes especificaciones: ");
            System.out.print("\n Peso: 2900 Toneladas");
            System.out.print("\n Empuje: 3500 Toneladas");
            System.out.print("\n Altura: 110,6 metros");
        
        }
        else if (lastElement1 == 2){
            System.out.print("\n Usted construyó una nave no tripulada que tendrá las siguientes especificaciones: ");
            System.out.print("\n Peso: 20,7 Toneladas");
            System.out.print("\n Empuje: 0,2 Toneladas");
            System.out.print("\n Altura: 9,79 metros");

        }
        else if (lastElement1 == 3){
            System.out.print("\n Usted construyó una nave tripulada que tendrá las siguientes especificaciones: ");
            System.out.print("\n Peso: 30,3 Toneladas");
            System.out.print("\n Empuje: 10 Toneladas");
            System.out.print("\n Altura: 10,5 metros");

        }
        else if (lastElement1 == 4){
            System.out.print("\n Usted construyó una nave con propulsores eletromagnéticos");
            System.out.print("\n Peso: 40 Toneladas");
            System.out.print("\n Empuje: 18,5 Toneladas");
            System.out.print("\n Altura: 14,4 metros");
        }
        else 
            System.out.print("\n Parámetro no valido");
        
        return data1;

    }

    /*
     * Método para guardar el tipo de combustible en un arreglo
     */
    public ArrayList<Integer> DataTipoCombustible(){
        data1.add(tipoCombustible);
        int lastIdx1 = data1.size() - 1;
		int lastElement1 = data1.get(lastIdx1);
        

        if (lastElement1 == 1){
            System.out.print("\n Su nave trabajará con Combustible Tipo 1");
        
        }
        else if (lastElement1 == 2){
            System.out.print("\n Su nave trabajará con Combustible Tipo 2");

        }
        else if (lastElement1 == 3){
            System.out.print("\n Su nave trabajará con Combustible Tipo 3");

        }
        else if (lastElement1 == 4){
            System.out.print("\n Su nave trabajará con Combustible Tipo 4");

        }
        
        else 
            System.out.print("\n Parámetro no valido");
        
        return data1;


    }

    /*
     * Método para guardar el tipo de color en un arreglo
     */

    public ArrayList<Integer> DataTipoColor(){
        data1.add(tipoColor);
        int lastIdx1 = data1.size() - 1;
		int lastElement1 = data1.get(lastIdx1);
        

        if (lastElement1 == 1){
            System.out.print("\n Su nave será de color rojo");
        
        }
        else if (lastElement1 == 2){
            System.out.print("\n Su nave será de color negro");

        }
        else if (lastElement1 == 3){
            System.out.print("\n Su nave será de color blanco");

        }
        else if (lastElement1 == 4){
            System.out.print("\n Su nave será de color azul");

        }
        else 
            System.out.print("\n Parámetro no valido");
        
        return data1;

    }
        
}
