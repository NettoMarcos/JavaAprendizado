package set.exercice_02.entities;

import java.util.Objects;

public class Student {
    private Integer code;

    public Student(){

    }

    public Student(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return Objects.equals(code, students.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
