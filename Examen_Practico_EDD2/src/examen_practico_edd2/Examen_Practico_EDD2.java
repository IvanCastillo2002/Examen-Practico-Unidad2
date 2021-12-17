/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico_edd2;
import java.util.Scanner;
/**
 *
 * @author ivned
 */
public class Examen_Practico_EDD2 {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
       ListaDobleFinal listaDoble = new ListaDobleFinal();     
       ArbolBalanceado arbolBalanceado = new ArbolBalanceado();
        String palabra1;//Abecedarios
        String palabra2;//Basicos
        String palabra3;//Calabaza
        String palabra4;//Dedal
        String palabra5;//Elefantes
        String palabra6;//Foro
        String palabra7;//Geometrias
        String palabra8;//Hector
        String palabra9;//Iván
        String palabra10;//Julio
        System.out.println("inserta solo 10 Palabras");
        for (int i = 0; i < 10; i++) {
        palabra1=entrada.nextLine();
        listaDoble.add(palabra1);      
      }
        System.out.println("");
        listaDoble.printList();  
   }
   }        
     
      
   
   

