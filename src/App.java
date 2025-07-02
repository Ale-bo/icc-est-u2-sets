import java.util.Set;

import controller.Sets;
public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparator(sets);
        runTreeSetConComparatorInvertido(sets);
        
    }
    public static void runHashSet(Sets sets){
        Set<String> palabras = sets.construirHashSet();
        for(String palabra : palabras){
            System.out.println(palabra);

        }
    }

        public static void runLinkedHashSet(Sets sets){
        Set<String> palabrasL = sets.construirLinkedHashSet();
        for(String palabra : palabrasL){
            System.out.println(palabra);
        }
    }
        public static void runTreeSet(Sets sets){
            Set<String> palabrasT = sets.construirTreeSet();
            for(String palabra : palabrasT){
                System.out.println(palabra);
            }
        }

         public static void runTreeSetConComparator(Sets sets){
             Set<String> palabrasT = sets.construirTreeSetConComparator();
             for(String palabra : palabrasT){
                 System.out.println(palabra);
             }
         }

         public static void runTreeSetConComparatorInvertido(Sets sets){
             Set<String> palabrasT = sets.construirTreeSetConComparadorInvertidoSet();
             for(String palabra : palabrasT){
                 System.out.println(palabra);
             }
         }


}
