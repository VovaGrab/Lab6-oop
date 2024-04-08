import java.util.Objects;

public class Student implements Comparable<Student> {
    private String nume;
    private float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Float.compare(student.medie, medie) == 0 && Objects.equals(nume, student.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, medie);
    }

    public boolean equals(Student student) {
        return false;
    }

    @Override
    public int compareTo(Student student) {
        return this.nume.compareTo(student.nume);
    }

    public float getAverageGrade() {
        return medie;
    }
}