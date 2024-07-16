package interfaces.interface_comparable.entities;

public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //compara um objeto com outro
    @Override
    public int compareTo(Employee other) {

        return salary.compareTo(other.getSalary());

        /*ao colocar um - antes do atributo sera listado em ordem decrescente.
        ex: -salary.compareTo(other.getSalary());
         */
    }
}
