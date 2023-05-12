/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import javax.swing.JOptionPane;

/*   Hacer un programa que tome dos numero y diga si ambos son pares o impares
 *
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int numero1, numero2 ;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero1")) ;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero2")) ;
      if((numero1 % 2 == 0) && (numero2 % 2 == 0) ) {
       
          JOptionPane.showMessageDialog(null,"Ambos numero son pares") ;
      
      }if ((numero1 % 2 > 0) && (numero2 % 2 > 0)) {
      
       JOptionPane.showMessageDialog(null,"Ambos numero son impares") ;
      } else {
           JOptionPane.showMessageDialog(null,"Los numeros no coinciden") ;
      }
    
    
    }
}
