package _4_streams._6_min_max;


import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;


public class MinMaxStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Znajdź najmłodszego pracownika
    public static void exercise1() {
        List<Employee> employees = getEmployees();

        Optional<Employee> result = employees.stream()
                .min(Comparator.comparing(Employee::getAge));

        System.out.println(result);
    }

    // TODO: Znajdź najlepiej zarabiającego pracownika
    public static void exercise2() {
        List<Employee> employees = getEmployees();

        Optional<Employee> result = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        System.out.println(result);
    }

    // TODO: Znajdź najbardziej kaloryczne, wegetarianskie danie
    private static void exercise3() {
        List<Dish> menu = menu();

        Optional<Dish> result = menu.stream()
                .filter(Dish::isVegetarian)
                .max(Comparator.comparing(Dish::getCalories));

        System.out.println(result);
    }
}