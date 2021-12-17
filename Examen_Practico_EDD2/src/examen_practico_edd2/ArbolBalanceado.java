/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico_edd2;

/**
 *
 * @author ivned
 */
public class ArbolBalanceado {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      ArbolBinario arbolB= new ArbolBinario();
      arbolB.add(11);//Abecedarios
      arbolB.add(7);// Basicos
      arbolB.add(8);// Calabaza
      arbolB.add(5);// Dedal
      arbolB.add(9);// Elefantes
      arbolB.add(4);// Foro
      arbolB.add(10);//  Geometrias
      arbolB.add(6);//  Hector
      arbolB.add(4);//  Iván
      arbolB.add(5);//  Julio
      System.out.println("");   
      System.out.println("Los Valores que se Repiten son 2 "
                                                              + "Foro - Iván Con 4 Letras " + "y " + "Julio - Dedal con 5 palabras");
      System.out.println("");
      System.out.println("Pre Order");
      arbolB.printPreOrder();
      System.out.println("");
      System.out.println("\nPost Order");
      arbolB.printPostOrder();
      System.out.println("");
      System.out.println("\nIn Order");
      arbolB.printInOrder();
      System.out.println("");
      System.out.println("\nDespues de Eliminar");
      arbolB.clear();
       arbolB.printInOrder();
       arbolB.printPostOrder();
       arbolB.printPostOrder();
   }
}
