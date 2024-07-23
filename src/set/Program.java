package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>(); //HashSet mais rapido porem não garante ordem, mais indicado caso a ordem não importar.
        hashset.add("TV");
        hashset.add("Tablet");
        hashset.add("Notebook");

        System.out.println(hashset.contains("Notebook"));
        for (String p : hashset) {
            System.out.println(p);
        }

        System.out.println("########################");

        Set<String> treeset = new TreeSet<>(); //TreeSet ordena os dados
        treeset.add("Tv");
        treeset.add("Tablet");
        treeset.add("Notebook");

        System.out.println(hashset.contains("Notebook"));
        for (String p : treeset) {
            System.out.println(p);
        }
        System.out.println("########################");

        treeset.removeIf(x -> x.charAt(0) == 'T');
        for (String p : treeset) {
            System.out.println(p);
        }
    }
}
