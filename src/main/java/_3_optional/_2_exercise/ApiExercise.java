package _3_optional._2_exercise;

import java.util.Optional;

import static _3_optional._2_exercise.Students.*;

public class ApiExercise {

    // TODO: Napisz metodę która wyświetli imię studenta, temat jego pracy oraz ocenę.
    //       Przygotuj się na to, że część studentów jeszcze nie została oceniona, zaś część nie złożyła jeszcze prac.
    public static void main(String[] args) {
        Student greatStudent = greatStudent();
        Student averageStudent = averageStudent();
        Student lazyStudent = lazyStudent();
        Student lateStudent = lateStudent();

        displayStudentInfo(greatStudent);
        displayStudentInfo(averageStudent);
        displayStudentInfo(lazyStudent);
        displayStudentInfo(lateStudent);
    }

    private static void displayStudentInfo(Student student) {
        Optional<Essay> essay = student.getEssay();
        if (essay.isPresent()) {
            if (essay.get().getGrade().isPresent()) {
                System.out.println(String.format("Student %s za pracę o temacie %s otrzymał ocenę %s.", student.getName(), essay.get().getTopic(), essay.get().getGrade().get()));
            } else {
                System.out.println(String.format("Student %s oddał pracę o temacie %s, ale nie otrzymał jeszcze oceny.", student.getName(), essay.get().getTopic()));
            }

        } else {
            System.out.println(String.format("Student %s jeszcze nie oddał swojej pracy.", student.getName()));
        }
    }
}