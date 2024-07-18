package hashcode_and_equals.application;

import hashcode_and_equals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("maria@gmail.com", "Maria");
        Client c2 = new Client("alex@gmail.com", "Alex");
        Client c3 = new Client("maria@gmail.com", "Maria");
        Client c4 = new Client("alex123@gmail.com", "Alex");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c4));

    }
}
