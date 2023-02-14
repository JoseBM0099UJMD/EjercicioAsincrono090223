/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioasincrono090223;

import javax.swing.JOptionPane;


/**
 *
 * @author Alejandro Bautista
 */
public class Ejercicio2Guia1 {
    /*Modifique el ejercicio 3, para que no permita que el usuario ingrese números negativos.
Si acaso los ingresará que se le notifique por medio de una ventana que no se pueden
ingresar números negativos.
    */
    public static void main(String[]args){
        String primernumero;
        String segundonumero;
        
        int numero1;
        int numero2;
        int suma;
        
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        
        if (numero1>=0){
            if(numero2>=0){
                suma = numero1 + numero2;
                
                JOptionPane.showMessageDialog(null, "La suma es:" + 
                suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Error el numero es negativo");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error el numero es negativo");
        }
        
        System.exit(0);
    }
    
}
