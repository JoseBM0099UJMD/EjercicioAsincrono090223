/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioasincrono090223;

import javax.swing.*;
/**
 *
 * @author Alejandro Bautista
 */
public class Ejercicio4 {
    /*Desarrollar un programa que solicite al usuario cuantos números desea ingresar,
    luego determinar
    -Cual es el mayor
    -Cual es el menor
    -Cuantos son pares
    *no se aceptan números negativos.
    */
    
    public static void main (String[] args){
        String nmax, numero ;
        double n, mayor = 0, menor = 1000, pares = 0 ;
        int contador, i=1;
        
        nmax = JOptionPane.showInputDialog(" ¿Cuantos numeros desea agregar? ");
        contador = Integer.parseInt(nmax);
        
        while(i<=contador){
            numero = JOptionPane.showInputDialog (" Ingrese un numero ");
            n = Double.parseDouble(numero);
            
            if(n>=0)
            {
                if(n>mayor)
                    mayor=n;
                if(n<menor)
                    menor=n;
                if(n==menor)
                    if(n==mayor)
                        pares= pares+1;
                    
                i = i+1;
            }
            else {
                JOptionPane.showMessageDialog(null, " Error, se ha digitado un numero negativo ");
            }
            
            
        }
        JOptionPane.showMessageDialog(null, " El numero mayor es " + mayor + "\n El numero menor es: " + menor +
                "\n Hay " + pares + " numero de pares ");
        
        
    }
}
