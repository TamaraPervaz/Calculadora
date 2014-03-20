/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;


public class PilaLista<T> {
    
   private Lista<T> lista = new Lista<T>();
   
   public void push(T dato){
       lista.insertaInicio(dato);       
   }
   
   public T pop() throws Exception{
       try {
           return lista.obtenPrimerElemento();
       } catch (Exception ex) {
           throw new Exception("La pila está vacía");
       }
   }
   
    public T peek() throws Exception{
       try {
           return lista.obtenPrimerElementoSinEliminar();
       } catch (Exception ex) {
           throw new Exception("La pila está vacía");
       }
   }
    
    public boolean vacia(){
        return lista.getInicio()==null;
    }
    
}
