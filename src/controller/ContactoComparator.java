package controller;

import java.util.Comparator;
import models.Contacto;


public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto o1, Contacto o2) {
        int cmp = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (cmp != 0) return cmp;
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}

