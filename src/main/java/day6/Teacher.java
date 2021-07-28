package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String student) {
        int grade = 2 + (int) Math.round(Math.random()*3);
        String textGrade = "* search error *";
        switch (grade) {
            case 2:
                textGrade = "неудовлетворительно";
                break;
            case 3:
                textGrade = "удовлетворительно";
                break;
            case 4:
                textGrade = "хорошо";
                break;
            case 5:
                textGrade = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student + " по предмету " + subject + " на оценку " + textGrade + ".");
    }
}
