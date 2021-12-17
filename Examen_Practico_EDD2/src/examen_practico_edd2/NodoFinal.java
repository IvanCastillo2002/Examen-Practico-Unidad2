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
public class NodoFinal {
   private String dato;
   private NodoFinal siguiente;
   private NodoFinal previo;
   //CONSTRUCTORES  
   public NodoFinal() {//default
       this.siguiente = null;
       this.previo=null;
   }
   public NodoFinal(String dato){
      this.dato=dato;
      this.siguiente=null;
      this.previo=null;
   } 
//METODOS GET Y SET  
   public String getDato( ) {
      return dato;
   }
   public void setDato(String dato) {
      this.dato = dato;
   }
   public NodoFinal getSiguiente() {
      return siguiente;
   }
   public void setSiguiente(NodoFinal siguiente) {
      this.siguiente = siguiente;
   } 

   public NodoFinal getPrevio() {
      return previo;
   }

   public void setPrevio(NodoFinal previo) {
      this.previo = previo;
   }
   
}
