package controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public static void main(String[] args) {
        Ejercicios e = new Ejercicios();
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
                String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";

        System.out.println("=== Ejercicio 1: Duplicados ===");
        System.out.println(e.tieneDuplicados(new int[]{1, 2, 3, 4, 5}));          
        System.out.println(e.tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));     

        System.out.println("\n=== Ejercicio 2: Isograma ===");
        System.out.println(e.esIsograma("murcielago"));   
        System.out.println(e.esIsograma("camaleón"));    

        System.out.println("\n=== Ejercicio 3: Palabras únicas (solo split) ===");
        System.out.println("Palabras únicas: " + e.contarPalabrasUnicas(texto));

        System.out.println("\n === Ejercicio 4: Comparar Textos ===");
        e.compararTextos(texto1, texto2);
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> conjunto = new HashSet<>();
        for (int n : numeros) {
            if (!conjunto.add(n)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> set = new HashSet<>();
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && !set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        String[] palabras = frase.split("\\s+"); 
        Set<String> unicas = new HashSet<>();
        for (String p : palabras) {
            if (!p.isEmpty()) {
                unicas.add(p);
            }
        }
        return unicas.size();
    }

public void compararTextos(String texto1, String texto2) {

        Set<String> palabras1 = new HashSet<>(Set.of(texto1.split("\\s+")));
        Set<String> palabras2 = new HashSet<>(Set.of(texto2.split("\\s+")));

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);

        Set<String> soloEn1 = new HashSet<>(palabras1);
        soloEn1.removeAll(palabras2);

        Set<String> soloEn2 = new HashSet<>(palabras2);
        soloEn2.removeAll(palabras1);

        Set<String> total = new HashSet<>(palabras1);
        total.addAll(palabras2);

        double porcentaje = comunes.size() * 100.0 / total.size();

        System.out.println("Texto 1: " + palabras1.size() + " palabras únicas");
        System.out.println("Texto 2: " + palabras2.size() + " palabras únicas");
        System.out.println("Cuantas Palabras comunes: " + comunes.size());
        System.out.println("Coincidencia léxica: " + porcentaje + "%");
        System.out.println("Solo en texto 1: " + soloEn1);
        System.out.println("Solo en texto 2: " + soloEn2);
    }
}
