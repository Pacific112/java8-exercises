package _4_streams._4_sort;

import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.util.List;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class SortStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Napisz comparator który posortuje pracowników wg. nazwiska
    private static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Posortuj pracowników według nazwiska
    private static void exercise2() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Posortuj pracowników od najmłodszego do najstarszego
    private static void exercise3() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Posortuj dania od najbardziej do najmniej kalorycznych
    private static void exercise4() {
        List<Dish> menu = menu();

    }

    // TODO: Posortuj pracowników od najstarszego do najmłodszego
    private static void exercise5() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Posortuj pracowników według imienia, a następnie według nazwiska
    private static void exercise6() {
        List<Employee> employees = getEmployees();

    }
}
