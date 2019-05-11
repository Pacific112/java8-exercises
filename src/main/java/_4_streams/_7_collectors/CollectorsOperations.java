package _4_streams._7_collectors;

import _4_streams.model.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static _4_streams.model.Employee.getEmployees;

public class CollectorsOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Stwórz mapę nazwisko -> pensja
    public static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Stwórz mapę wiek -> pracownicy.
    public static void exercise2() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Podziel pracowników na dwie grupy -> tych zarabiajacych powyzej 5000 zł i tych zarabiajacych mniej. Ktora grupa jest wieksza?
    public static void exercise3() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdz sredni wiek pracownika nie wykorzystujac IntStream
    public static void exercise4() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdz srednia, najmniejsza oraz najwieksza pensje pracownika korzystajac z metody reduce
    public static void exercise5() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Wypisz imiona i nazwiska pracowników w nastepujacym formacie:
    //       <imie1>-<nazwisko1>,<imie2>-<nazwisko2>
    public static void exercise6() {
        List<Employee> employees = getEmployees();

    }

}
