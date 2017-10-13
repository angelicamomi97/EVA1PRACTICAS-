/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_buscar_arreglos;

import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class EVA1_15_BUSCAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int buArray [];
        Scanner datoArr = new Scanner(System.in);
        System.out.println("de que tamaño quieres el arreglo");
        int nDato = datoArr.nextInt(); //TAMAÑO DEL ARRAY
        buArray = new int [nDato]; //incicializando el array con lo que el cliente escribe      
        
        for (int z = 0; z < nDato ; z++) {
            System.out.println("Ingresa Numeros");
            buArray[z] = datoArr.nextInt(); //llenar el array con los datos que dio el usuario
        }
        System.out.println("Dime un numero");
           int buNum = datoArr.nextInt(); 
        for (int  x = 0;  x <nDato;  x++) {
          if (buArray[x]==buNum ){
              System.out.println("El numero "+ buNum + " esta en la posicion: " + x );
              break;
              
          }
            
        }
           
    }
    
}
