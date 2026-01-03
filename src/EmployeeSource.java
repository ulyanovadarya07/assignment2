import java.util.ArrayList;
public class EmployeeSource {
    public static ArrayList<Employee> getEmployees() {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Lennon", "Manager", 27045.78));
        employees.add(new Employee("George", "Harrison", "Developer", 50000.00));
        employees.add(new Employee("Brian", "Epstein", "Director", 80000.00));

        return employees;
    }
}
