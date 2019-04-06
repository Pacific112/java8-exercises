package _4_streams._6_min_max;

import pl.infoshare.streams.model.Dish;
import pl.infoshare.streams.model.Employee;

import java.util.List;

import static pl.infoshare.streams.model.Dish.menu;
import static pl.infoshare.streams.model.Employee.getEmployees;

public class MinMaxStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Znajdź najmłodszego pracownika
    public static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdź najlepiej zarabiającego pracownika
    public static void exercise2() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdź najbardziej kaloryczne, wegetarianskie danie
    private static void exercise3() {
        List<Dish> menu = menu();

    }
}