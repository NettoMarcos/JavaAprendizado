package set.exercice_02.application;

import set.exercice_02.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("unique code from student " + i  + "°");
            int code = sc.nextInt();
            students.add(new Student(code));
        }
        System.out.println("############################");
        System.out.println();
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("unique code from student " + i + "°");
            int code = sc.nextInt();
            students.add(new Student(code));
        }
        System.out.println("############################");
        System.out.println();
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("unique code from student " + i + "°");
            int code = sc.nextInt();
            students.add(new Student(code));
        }

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
