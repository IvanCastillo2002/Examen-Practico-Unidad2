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
public class ArbolBinario{
   private NodoBinario root;
private NodoBinario inicio;
private NodoBinario fin;
private int tama;
   public ArbolBinario() {
   this.root=null;//Arbol Vacio
   inicio = null;
   fin = null;
   tama = 0;
   }
  //Agregar Los Nodos
   public void add(int valor){
      NodoBinario nuevo=new NodoBinario(valor);
      if(root==null){//No hay Ningun Nodo en el Arbol
         root=nuevo;
      }else{//Existen Nodos en el Arbol        
         addRecu(root, nuevo);    
      }     
   }
  //Recursividad
   private void addRecu(NodoBinario actual, NodoBinario nuevo){
      
      if(nuevo.getDato() < actual.getDato()){
if(actual.getIzquierda() == null){
      actual.setIzquierda(nuevo);
}else{
   addRecu(actual.getIzquierda(), nuevo);
}
   }else if(nuevo.getDato() > actual.getDato()){
      if(actual.getDerecha()== null){
      actual.setDerecha(nuevo);
}else{
   addRecu(actual.getDerecha(), nuevo);
}
   }else{
         System.out.println("El valor ya existe en el arbol");  
   }
}
   //Imprimir los Ordenes de la Lista
   public void printPreOrder(){
      preOrder(root);
   }
   //Con esto podemos Borrar cualquier lista Siempre y Cuando la declaremos
   public void clear(){
      inicio=null;
      fin=null;
      tama = 0;
      root = null;
   }
   //PREORDER
   private void preOrder (NodoBinario actual){
      if(actual !=null){
         System.out.print("[" + actual.getDato() + "]");//Primero Visitamos el Nodo Root
     preOrder(actual.getIzquierda());// Vsitamos el Nodo Izquierdo
     preOrder(actual.getDerecha()); //Visitamos el Nodo Derecho
      }
   }
   //POST ORDER
   public void printPostOrder(){
      postOrder(root);//Llama al metodo recursivo preorder
   }
   private void postOrder (NodoBinario actual){
      if(actual !=null){       
     postOrder(actual.getIzquierda());// Vsitamos el Nodo Izquierdo
     postOrder(actual.getDerecha()); //Visitamos el Nodo Derecho
     System.out.print("[" + actual.getDato() + "]");//Primero Visitamos el Nodo Root
      }
   }
   // Imprimir InOrden
   public void printInOrder(){
      inOrder(root);//Llama al metodo recursivo preorder
   }
   private void inOrder (NodoBinario actual){
      if(actual !=null){       
     inOrder(actual.getIzquierda());//Vsitamos el Nodo Izquierdo
 System.out.print("[" + actual.getDato() + "]"); //Vsitamos el Nodo Root
     inOrder(actual.getDerecha());  //Vsitamos el Nodo Derecha
      }     
   }    
   }
