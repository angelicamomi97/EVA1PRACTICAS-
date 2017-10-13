/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_min_max_arreglo;

import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class EVA1_17_MIN_MAX_ARREGLO {

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
            reArray[v] = datoArr.nextInt();
        }
        int numMayo = reArray[0];
        int numMeno = reArray[0];
        for (int y = 0; y < usuDato; y++) {
            if (numMayo < reArray[y]) {
                numMayo = reArray[y];

            }
            if (numMeno > reArray[y]) {
                numMeno = reArray[y];
            }
        }
        System.out.println("Mayor: " + numMayo);
        System.out.println("Numero Menor es: " + numMeno);

    }
}
