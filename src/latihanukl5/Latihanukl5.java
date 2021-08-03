/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl5;

/**
 *
 * @author MOKLET-2
 */
public class Latihanukl5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        a[0][0] = -5;
        a[0][1] = 3;
        a[1][0] = 7;
        a[1][1] = 2;

    int b[][] = new int[2][2];
        b[0][0] = 3;
        b[0][1] = 1;
        b[1][0] = 5;
        b[1][1] = -2;

        for (int c = 0; c < a.length; c++){
            for (int d = 0; d < a[0].length; d++){
                int e = a[c][d] - b[c][d]; 
                System.out.print( e + " ");
            }       
            System.out.println();
        }    }
    
}
