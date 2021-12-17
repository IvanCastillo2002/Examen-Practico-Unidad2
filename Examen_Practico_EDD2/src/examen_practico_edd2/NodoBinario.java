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
public class NodoBinario {
   private int dato;
   private NodoBinario derecha;
   private NodoBinario izquierda;
   
   //CONSTRUCTORES  
   public NodoBinario() {//default
       this.derecha = null;
       this.izquierda=null;
   }
   public NodoBinario(int dato){
      this.dato=dato;
      this.derecha=null;
      this.izquierda=null;
   } 
//METODOS GET Y SET  
   public int getDato( ) {
      return dato;
   }
   public void setDato(int dato) {
      this.dato = dato;
   }

   public NodoBinario getDerecha() {
      return derecha;
   }

   public void setDerecha(NodoBinario derecha) {
      this.derecha = derecha;
   }

   public NodoBinario getIzquierda() {
      return izquierda;
   }

   public void setIzquierda(NodoBinario izquierda) {
      this.izquierda = izquierda;
   }
   
   
}
