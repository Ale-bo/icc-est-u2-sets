package controller;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import models.Contacto;

public class ContactoController {

    private void llenarAgenda(Set<Contacto> agenda) {
        // -- En este exacto orden de inserción --
        agenda.add(new Contacto("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez",    "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez",    "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez",    "123456789"));
        agenda.add(new Contacto("Ana",   "Perez",    "987654321"));
        agenda.add(new Contacto("Luis",  "Perez",    "111111111"));
    }

    public void runTreeContactoCompleto() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        llenarAgenda(agenda);
        System.out.println("Agenda ordenada por Apellido - Nombre - Teléfono");
        agenda.forEach(System.out::println);
    }

    public void runTreeContactoSimple() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        llenarAgenda(agenda);
        System.out.println("Agenda ordenada por Apellido - Nombre");
        agenda.forEach(System.out::println);
    }

    public void runTreeContactoHash() {
            Set<Contacto> agenda = new TreeSet<>(Comparator.comparingInt(Contacto::hashCode));
        llenarAgenda(agenda);
        System.out.println("Agenda ordenada por HASHCODE");
        agenda.forEach(System.out::println);
    }
}
