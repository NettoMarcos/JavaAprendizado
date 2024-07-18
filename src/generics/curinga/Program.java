package generics.curinga;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //List<Object> não é o supertipo de qualquer tipo de lista:

        //List<Object> myObjs = new ArrayList<Object>();
        //List<Integer> myNumbers = new ArrayList<Integer>();
        //myObjs = myNumbers;  erro de compilação

        //supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

        //List<?> myObjs = new ArrayList<Object>();
        //List<Integer> myNumbers = new ArrayList<Integer>();
        //myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        List<String> myStrings = Arrays.asList("Maria", "João", "Jorge");

        printList(myInts);
        printList(myStrings);
    }
    public static void printList(List<?> list) {

        //Porém não é possível adicionar dados a uma
        //coleção de tipo curinga
        //list.add(3); erro de compilação

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}


