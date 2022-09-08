/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Pais;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 *
 * @author Raul
 */
public class Comparadores implements Comparator<Pais> {
    
    private Collator collator;
    
    public Comparadores(){
        this.collator = Collator.getInstance(new Locale("es"));
        collator.setStrength(Collator.TERTIARY);
    }
    
   public static Comparator<Pais> ordenarPorNombre = new Comparator<Pais> () {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };

    @Override
    public int compare(Pais t, Pais t1) {
        return collator.compare(t1.getNombre(), t.getNombre());
    }
}
