package _4_streams._3_matching;

import pl.infoshare.streams.model.Dish;
import pl.infoshare.streams.model.Employee;

import java.util.List;

import static pl.infoshare.streams.model.Dish.menu;
import static pl.infoshare.streams.model.Employee.getEmployees;

public class MatchingStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Sprawdź czy któryś z pracowników zarabia powyżej 10000 zł
    private static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Upewnij się, że zadne z dań nie przekracza 1000 kalorii
    public static void exercise2() {
        List<Dish> menu = menu();

    }

    // TODO: Sprawdź czy któryś z pracowników ma imię krótsze niż 5 znaków
    private static void exercise3() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Sprawdź czy wszystkie nazwiska zaczynaja sie z wielkiej litery
    private static void exercise4() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Czy wszyscy pracownicy zarabiaja powyzej 2000 zł?
    private static void exercise5() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Upewnij się, że żaden z pracowników nie nazywa się John
    private static void exercise6() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Czy menu zawiera dania wegetariańskie?
    private static void exercise7() {
        List<Dish> menu = menu();

    }

    // TODO: Czy menu zawiera tylko dania wegetariańskie?
    private static void exercise8() {
        List<Dish> menu = menu();

    }

    // TODO: Czy wszystkie mięsne dania posiadają powyżej 500 kalorii?
    private static void exercise9() {
        List<Dish> menu = menu();

    }
}