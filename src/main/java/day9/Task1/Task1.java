package day9.Task1;


public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Юрий Боков","ОТДЖ-21" );
        Teacher teacher = new Teacher("Алексей Павлович Березин", "Музыка");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
