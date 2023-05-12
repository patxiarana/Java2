/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios.java3;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 * Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula ;
 * 
 */
public class EjerciciosJava3 {

    public static void main(String[] args) {
        char letra ;
        
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0) ; 
        if(Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null, "Es una letra mayuscula") ;
        } else {
             JOptionPane.showMessageDialog(null, "Es una letra miniscula") ;
        }
    }
}
