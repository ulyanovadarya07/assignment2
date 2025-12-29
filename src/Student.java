public class Student {
    private static int id_gen = 1;
    private String name;
    private String surname;
    private double gpa;

    public Student() {}

    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public int getId(){
        return id_gen;
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public double getGpa(){
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



}

