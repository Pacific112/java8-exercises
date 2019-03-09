package _3_optional._2_exercise;

public class Students {

    public static Student greatStudent() {
        Essay essay = new Essay();
        essay.setTopic("Complex Chemistry Topic");
        essay.setGrade(5);

        Student student = new Student();
        student.setName("Anastazja");
        student.setEssay(essay);

        return student;
    }

    public static Student averageStudent() {
        Essay essay = new Essay();
        essay.setTopic("Psychological Stuff");
        essay.setGrade(3);

        Student student = new Student();
        student.setName("Mikołaj");
        student.setEssay(essay);

        return student;
    }

    public static Student lateStudent() {
        Essay essay = new Essay();
        essay.setTopic("Late topic");

        Student student = new Student();
        student.setName("Maciek");
        student.setEssay(essay);

        return student;
    }

    public static Student lazyStudent() {
        Student student = new Student();
        student.setName("Łukasz");

        return student;
    }
}