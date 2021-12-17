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
public class ListaDobleFinal {
   private NodoFinal inicio;//ACCESO A MI LISTA, PUNTO DE PARTIDA
   private NodoFinal fin;
   private int tama;//contador de nodos  

   public ListaDobleFinal(){
      inicio = null;
      fin = null;
      tama = 0;
   }
     //AGREGAR NODOS 
   public void add(String valor){
      NodoFinal nuevo= new NodoFinal(valor);
      //Hay Nodos en la lista?
      if(inicio==null){//Lista Vacia
         inicio=nuevo;//conectamos el primer nodo a la lista
         fin=nuevo;
      }else{//Lista con Nodos
         //agregar el nodo al final 
      fin.setSiguiente(nuevo);
      nuevo.setPrevio(fin);
      fin= nuevo;//Nos movemos al final de la lista
      }
      tama++;
   }  
    //IMPRIMIR LA LISTA
   public void printList(){
      NodoFinal temp = inicio;//aqui empezamos
         //WHILE
         while (temp != null) {//Mientras Temp! = NULL Nos vamos a mover             
             System.out.print(temp.getDato() + "  -  ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo 
         }    
   }
   //BORRAR LA LISTA
   public void clear(){//borramos todos los nodos de la lista
      inicio=null;
      fin=null;
      tama = 0;
   }
   
    }   
    
   
   


