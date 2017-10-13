/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_repite_arreglo;

import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class EVA1_16_Repite_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int reArray[];
        Scanner datoArr = new Scanner(System.in);
        System.out.println("de que tamaño quieres el arreglo");
        int usuDato = datoArr.nextInt(); //TAMAÑO DEL ARRAY
        reArray = new int[usuDato];
        for (int v = 0; v < usuDato; v++) {
            System.out.println("Ingresa Numeros");
            reArray[v] = datoArr.nextInt(); //llenar el array con los datos que dio el usuario
        }
        System.out.println("Dime un Numero");
        int tellNum = datoArr.nextInt();
        int cContador = 0;
        for (int x = 0; x < usuDato; x++) {
            if (reArray[x] == tellNum) {
                cContador++;

            }

        }
        System.out.println("EL NUMERO; " + tellNum + " Se repitio un total de; " + cContador  );
    }

}
