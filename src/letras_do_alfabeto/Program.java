package letras_do_alfabeto;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        char[] alfabeto = new char[26];

        for (int i = 0; i < alfabeto.length; i++){
            alfabeto[i] = (char) ('a' + i);
        }
        System.out.println("###################");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de 1-26 para retornar o numero de letras desejado: ");
        int n = sc.nextInt();
        System.out.println("###################");
        for (int i = 0; i < n; i++){
            System.out.println(alfabeto[i]);
        }
        System.out.println("###################");
    }
}
