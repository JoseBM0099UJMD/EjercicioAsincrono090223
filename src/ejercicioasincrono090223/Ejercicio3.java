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
public class Ejercicio3 {
    /*Modificar el ejemplo 9 de tal forma que me permita leer el número de empleados de
los cuales voy a ingresar el sueldo, ademas el programa no permitirá leer datos
negativos, así que al ingresar un dato negativo me dará un error y me pedirá de
nuevo el dato, si el dato sigue siendo negativo no me permitirá ingresar el sueldo
de otro empleado hasta que se ingrese el valor positivo del sueldo.
    */
    public static void main(String [] args){
        String leer;
        double sueldo, mayor=0, menor=10000;
        int contador=0, i = 0;
        
    /*
    do
       {
           leer = JOptionPane.showInputDialog("Ingrese el sueldo del Empleado" + aux++);
               sueldo = Double.parseDouble(leer);
           
           for(int i=1;i<=5;i++)
           {   
               if(sueldo>300)
               contador=contador +1;
               
              if(sueldo>mayor)
               mayor=sueldo;
              if(sueldo<menor)
               menor=sueldo;
              i=i+1;
           }
           JOptionPane.showMessageDialog(null," El sueldo Mayor es de $: " + mayor +
            "\nEl sueldo Menor es de $: " + menor +
            "\n" + contador + " Empleados tienen un sueldo mayor de $300");
           
           }
    while (sueldo>=0);
    JOptionPane.showMessageDialog(null,"No se permiten numeros negativos, intente de nuevo");
    */
    
    while(i<=5){
        leer = JOptionPane.showInputDialog("Ingrese el sueldo del Empleado" + i);
               sueldo = Double.parseDouble(leer);
               if(sueldo>=0){
                   if(sueldo>300)
               contador=contador +1;
               
              if(sueldo>mayor)
               mayor=sueldo;
              if(sueldo<menor)
               menor=sueldo;
              i=i+1;
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(null, " No se permiten numeros negativos, vuelva a intentar ");

               }
    }
    JOptionPane.showMessageDialog(null," El sueldo Mayor es de $: " + mayor +
            "\nEl sueldo Menor es de $: " + menor +
            "\n" + contador + " Empleados tienen un sueldo mayor de $300");
                      
           
               
           
    
    
    
    }
    
}
