import java.util.ArrayList;
public class StudentSource {
    public static ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali", "Starr", 2.10));   // без стипендии
        students.add(new Student("Paul", "McCartney", 3.50)); // со стипендией
        students.add(new Student("Pete", "Best", 2.00));
        students.add(new Student("George", "Martin", 3.90));
        return students;
    }
}
