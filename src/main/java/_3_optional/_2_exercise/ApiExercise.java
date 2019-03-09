package _3_optional._2_exercise;

import static _3_optional._2_exercise.Students.*;

public class ApiExercise {

    // TODO: Napisz metodę która wyświetli imię studenta, temat jego pracy oraz ocenę.
    //       Przygotuj się na to, że część studentów jeszcze nie została oceniona, zaś część nie złożyła jeszcze prac.
    public static void main(String[] args) {
        Student greatStudent = greatStudent();
        Student averageStudent = averageStudent();
        Student lazyStudent = lazyStudent();
        Student lateStudent = lateStudent();

    }

    private static void displayStudentInfo(Student student) {

    }
}