/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Class.ColaList;
import Class.PilaLista;
import Class.Simbolos;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Notacion {

    public ColaList<String> convertirPostfija(String infija) throws Exception {
        ColaList<String> colaPostfija = new ColaList<>();
        PilaLista<String> pila = new PilaLista<>();
       
        for (char cLetra :  infija.toCharArray()) {
            String letra = String.valueOf(cLetra);
            if (letra.equals("(")) {
                pila.push(letra);
            } else {
                if (letra.equals(")")) {
                    while (!pila.peek().equals("(")) {
                        colaPostfija.push(pila.pop());
                    }
                    pila.pop();
                } else {
                    if (Simbolos.isOperando(letra)) {
                        colaPostfija.push(letra);
                    } else {
                        while (!pila.vacia() && Simbolos.lessOrEqualThan(letra, pila.peek()) && !pila.peek().equals("(")) {
                            colaPostfija.push(pila.pop());
                        }
                        pila.push(letra);
                    }
                }
            }
        }
        while (!pila.vacia()) {
            colaPostfija.push(pila.pop());
        }

        return colaPostfija;
    }

    public static void main(String[] args) {
        Notacion notaciones = new Notacion();
        try {
            System.out.println(notaciones.convertirPostfija("(4+5)^3/4+(3-2)"));
        } catch (Exception ex) {
            Logger.getLogger(Notacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
