import controller.ContactoController;
// import controller.Sets; // Descomenta si luego necesitas probar los Sets

public class App {
    public static void main(String[] args) {

        ContactoController controller = new ContactoController();

        controller.runTreeContactoSimple();
        System.out.println();

        controller.runTreeContactoCompleto();
        System.out.println();

        controller.runTreeContactoHash();
    }
        // Sets sets = new Sets();
        // runHashSet(sets);
        // runLinkedHashSet(sets);
        // runTreeSet(sets);
        // runTreeSetConComparador(sets);
        // runTreeSetConComparadorInvertido(sets);
    }


    /*
    private static void runHashSet(Sets sets) {
        System.out.println("HashSet:");
        for (String palabra : sets.construirHashSet()) {
            System.out.println(palabra);
        }
    }

    private static void runLinkedHashSet(Sets sets) {
        System.out.println("LinkedHashSet:");
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSet(Sets sets) {
        System.out.println("TreeSet:");
        for (String palabra : sets.construirTreeSet()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSetConComparador(Sets sets) {
        System.out.println("TreeSet con Comparador:");
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSetConComparadorInvertido(Sets sets) {
        System.out.println("TreeSet con comparador invertido:");
        for (String palabra : sets.construirTreeSetConComparadorInvertidoSet()) {
            System.out.println(palabra);
        }
    }
    */

