/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import javax.swing.JOptionPane;

/**
 * Pedir un numero entre 99 999 y decir cuantas cifras tiene 
 *
 * @author Usuario
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int n, cifras;
           
            n = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero entero"));
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            JOptionPane.showMessageDialog(null,"El número tiene " + cifras+ " cifras");     
    }
}
