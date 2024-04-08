import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {

    public Gradebook(Comparator<? super Float> comparator) {
        super(comparator);
    }

    public void add(Student student) {
        float roundedGrade = Math.round(student.getAverageGrade());
        List<Student> students = getOrDefault(roundedGrade, new ArrayList<>());
        students.add(student);
        put(roundedGrade, students);
    }

    public void sortListsAlphabetically() {
        for (Map.Entry<Float, List<Student>> entry : entrySet()) {
            Collections.sort(entry.getValue());
        }
    }

    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook(Comparator.reverseOrder());
        gradebook.add(new Student("Max", 8.5f));
        gradebook.add(new Student("Slavic", 9.0f));
        gradebook.add(new Student("Klipici", 7.5f));
        gradebook.add(new Student("Dima", 8.5f));

        gradebook.sortListsAlphabetically();

        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            System.out.println("Grade: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println(student);
            }
        }
    }
}