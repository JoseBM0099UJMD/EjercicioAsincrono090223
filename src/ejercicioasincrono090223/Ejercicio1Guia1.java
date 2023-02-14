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
public class Ejercicio1Guia1 {
    
    /*Crear un programa en consola que me permita saber si dos números son divisibles entre
    sí, para saber si un numero es divisible por otro se tiene que obtener el modulo y si este
    es cero entonces este número es divisible por el otro.
    */
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        

    
    int PriNumero;
    int SegNumero;
    int aux;
    
    System.out.print("Digita el primer numero");
    PriNumero = reader.nextInt();
    
    System.out.print("Digita el segundo numero");
    SegNumero = reader.nextInt ();
    
    aux = PriNumero%SegNumero;
    
    if(aux == 0)
    {
        System.out.print("Los numeros son divisbles entre si");
    }
    else{
        System.out.print("Los numeros no son divisibles entre si");
    }
    
    
    System.exit(0);
    
    }
    
    
}
