/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import Class.ColaList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Colas {
    
    public static void main(String[] args){
        try {
            ColaList<Integer> cola = new ColaList<>();
            cola.push(1);
            cola.push(2);
            cola.push(3);
            System.out.println(cola.pop());
            System.out.println(cola.pop());
            System.out.println(cola.pop());
        } catch (Exception ex) {
            Logger.getLogger(Colas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
