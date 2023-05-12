/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import javax.swing.JOptionPane;

/* Un obrero necesita calcular su salario semana, el se obtiene de la sieguiente manera:
si trabajar 40horas o menos se le paga $16 por hora, si trabaja mas de 40 horas se le paga $16 por cada una de las 
primeras 40 horas y 20 por cada hora extra .
 *
 * 
 */
public class Ejercicio5 {

    public static void main(String[] args) {
       int HorasTrabajadas ;
       float SalarioTotal ;
       
       HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas")) ;
       
       if(HorasTrabajadas <= 40 ) {
       SalarioTotal = HorasTrabajadas * 16 ;
       
       } else { 
       SalarioTotal = (40 * 16) + ((HorasTrabajadas - 40) * 20 ) ;
       
           }
       
       JOptionPane.showMessageDialog(null,"El salario total es " + SalarioTotal) ;
    }
}
