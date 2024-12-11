/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[5];
        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);
        
        // arreglo de tipo double
        // imprime el 0.0 porque es un arreglo de tipo double y no tiene 
        // asignado un valor
        
        double[] arreglo2 = new double[5];
        System.out.println(arreglo2[0]);
        
        // arreglo de tipo String
        // imprime null porque es un arreglo de tipo String y no tiene 
        // ningun valor asignado
        
        String[] arreglo4 = new String[5];
        System.out.println(arreglo4[0]);
        
        // arreglo de tipo boleano
        // imprime falso pórque es un arreglo de tipo boolean y no tiene
        // asignado ningun valor
        boolean[] arreglo5 = new boolean[5];
        System.out.println(arreglo5[0]);
    }

}
