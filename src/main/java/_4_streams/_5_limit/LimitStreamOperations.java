package _4_streams._5_limit;

import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.util.List;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class LimitStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Wypisz 3 pierwszych pracowników
    private static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Wypisz 2 ostatnich pracowników
    private static void exercise2() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Wypisz 3 najlepiej zarabiajacych pracowników
    private static void exercise3() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdź trzy najbardziej kaloryczne dania?
    private static void exercise4() {
        List<Dish> menu = menu();

    }

    // TODO: Wypisz na ekran wiek pracowników. Nie powtarzaj tych samych wartości
    private static void exercise5() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Upewnij się, że żaden z pracowników nie nazywa się tak samo
    private static void exercise6() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdź najmłodszego pracownika
    private static void exercise7() {
        List<Employee> employees = getEmployees();

    }
}