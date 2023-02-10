/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioasincrono090223;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bautista
 */
public class EjercicioAsincrono090223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Al ingresar la nota de un alumno, se desea saber si este aprobó o no 
          una materia en el colegio. Para aprobar se necesita una nota mayor o igual a 
          7.0. Diseñe una aplicación en Java que al ingresar la nota muestre con un 
          mensaje en el cual indique si el alumno aprobó o no. Además, si la nota está 
          entre 6.50 y 6.99, tiene la posibilidad de realizar un examen de suficiencia para aprobar.
        */
        
        Scanner reader = new Scanner(System.in);
        float NotaAlumno;
        float NotaAVerificar;
   
        
        System.out.print("Ingresa la nota del estudiante");
        NotaAlumno = reader.nextFloat();
        
        if (NotaAlumno >= 7){
            System.out.print("APROBADO ");
        }
        else
        {
            if (NotaAlumno >= 6.5)
            {
                System.out.print("Tiene opcion de recuperación ");
            }
        
        else
        {           
            System.out.print ("REPROBADO "); 
        }
        }
    }
    }
