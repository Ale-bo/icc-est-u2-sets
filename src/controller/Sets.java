package controller;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Sets {
    

    public Set<String> construirHashSet(){
         Set<String> palabras = new HashSet<>();
         palabras.add("Laptop");
         palabras.add("Manzana");
         palabras.add("Pera");
         palabras.add("Celular");
         palabras.add("Laptop");
         palabras.add("Celular");
         System.out.println("IvannaNievecela");
         System.out.println("HashSet");
         System.out.println(palabras);

         return (palabras);
    }
    
    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasL = new LinkedHashSet<>();
        palabrasL.add("Laptop");
        palabrasL.add("Manzana");
        palabrasL.add("Pera");
        palabrasL.add("Celular");
        palabrasL.add("Laptop");
        palabrasL.add("Celular");
        System.out.println("LinkedHashSet");
        System.out.println(palabrasL);   

        return (palabrasL);
    }

    public Set<String> construirTreeSet(){
        Set<String> palabrasT = new TreeSet<>();
        palabrasT.add("Laptop");
        palabrasT.add("Manzana");
        palabrasT.add("Pera");
        palabrasT.add("Celular");
        palabrasT.add("Laptop");
        palabrasT.add("Celular");
        System.out.println("TreeSet");
        System.out.println(palabrasT);  

        return (palabrasT);

    }

    public Set<String> construirTreeSetConComparator(){

    Comparator<String> comparador = new Comparator<>() {
        @Override
        public int compare(String s1, String s2) {
            int result = Integer.compare(s1.length(), s2.length());
            // si son iguales en tamaño, comparar alfabéticamente
            if (result == 0) {
                result = s1.compareTo(s2);
            }
            return result;
        }
    };
    
    Set<String> miTreeSetComparator = new TreeSet<>(comparador);

    miTreeSetComparator.add("Laptop");
    miTreeSetComparator.add("Manzana");
    miTreeSetComparator.add("Pera");
    miTreeSetComparator.add("Celular");
    miTreeSetComparator.add("Laptop");  
    miTreeSetComparator.add("celular"); 
    miTreeSetComparator.add("Celulas");

    System.out.println("TreeSet con comparador");
    System.out.println(miTreeSetComparator);

    return miTreeSetComparator;
    }

    public Set<String> construirTreeSetConComparadorInvertidoSet() {

    Comparator<String> comparadorInvertido = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int result = Integer.compare(s2.length(), s1.length());
            if (result == 0) {
                result = s2.compareTo(s1);
            }
            return result;
        }
    };

    Set<String> miTreeSetComparatorInvertido = new TreeSet<>(comparadorInvertido);

    miTreeSetComparatorInvertido.add("Laptop");
    miTreeSetComparatorInvertido.add("Manzana");
    miTreeSetComparatorInvertido.add("Pera");
    miTreeSetComparatorInvertido.add("Celular");
    miTreeSetComparatorInvertido.add("Laptop");
    miTreeSetComparatorInvertido.add("Celular");
    miTreeSetComparatorInvertido.add("Celulas");
    System.out.println("TreeSet con comparador invertido");
    System.out.println(miTreeSetComparatorInvertido);

    return miTreeSetComparatorInvertido;
   
    }
        
}