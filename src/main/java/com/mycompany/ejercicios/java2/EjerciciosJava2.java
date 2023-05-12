/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios.java2;

import javax.swing.JOptionPane;

/**
 * Hacer un programa que recibe un numero entero y muestre si es multiplo de 10 
 * 
 */
public class EjerciciosJava2 {

    public static void main(String[] args) {
    /*    int numero ;
            
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero")) ;
        
        if(numero%10 == 0 ) {
            JOptionPane.showInputDialog("El numero es multiplo de 10") ;
        } else {
             JOptionPane.showInputDialog("El numero no es multiplo de 10") ;
        }   */
    
       int numero1, numero2 ; 
       
       numero1 =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero")) ;
       
      numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero entero")); 
      
      
      if(numero1 < numero2) { 
      
         JOptionPane.showInputDialog("El numero" + numero2 + "es mayo") ;
      } if (numero1 > numero2 ) {
           JOptionPane.showInputDialog("El numero" + numero1+ "es mayo") ;
          
      } else {
      JOptionPane.showInputDialog("los numeros son iguales") ; 
}                 
    
    }
}
