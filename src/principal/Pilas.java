/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import Class.PilaArreglo;
import Class.PilaLista;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Pilas {

    public static void main(String[] args) {
        pilaPrueba();
       
    }
    
    public static void pilaPrueba(){
        try {
            PilaLista<Integer> pila = new PilaLista<>();
            pila.push(1);
            pila.push(2);
            pila.push(3);
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
        } catch (Exception ex) {
            Logger.getLogger(Pilas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void pilaArreglo(){
     
        PilaArreglo<Integer> pilaArreglo = new PilaArreglo<>();
        try {
            pilaArreglo.push(10);
            pilaArreglo.push(12);
            System.out.println("Elemento:"+pilaArreglo.pop());
            System.out.println("Elemento:"+pilaArreglo.pop());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
}
