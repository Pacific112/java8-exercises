package _4_streams.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Employee {

    private final String name;
    private final String surname;
    private final int age;
    private final BigDecimal salary;

    public Employee(String name, String surname, int age, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public boolean earnsMoreThan() {
        return getSalary().compareTo(BigDecimal.valueOf(3000)) > 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Maciej", "Koziara", 26, BigDecimal.valueOf(2001)),
                new Employee("Mikołaj", "Koziara", 22, BigDecimal.valueOf(2142)),
                new Employee("Anastazja", "Lebedeva", 23, BigDecimal.valueOf(2020)),
                new Employee("Nikola", "Kucharska", 67, BigDecimal.valueOf(4767)),
                new Employee("Mikołaj", "Jankowski", 22, BigDecimal.valueOf(7756)),
                new Employee("Adam", "Wolski", 67, BigDecimal.valueOf(1976)),
                new Employee("Aleksandra", "Walczak", 47, BigDecimal.valueOf(8188)),
                new Employee("Bartek", "Kalinowski", 35, BigDecimal.valueOf(7444)),
                new Employee("Wiktoria", "Majewska", 35, BigDecimal.valueOf(3650)),
                new Employee("Kacper", "Dudek", 60, BigDecimal.valueOf(5690)),
                new Employee("Artur", "Czerwiński", 38, BigDecimal.valueOf(5287)),
                new Employee("Stanisław", "Kruk", 29, BigDecimal.valueOf(7331)),
                new Employee("Jan", "madej", 63, BigDecimal.valueOf(4223)),
                new Employee("Kacper", "Bednarek", 46, BigDecimal.valueOf(3800)),
                new Employee("Kalina ", "Kozłowska", 59, BigDecimal.valueOf(7764)),
                new Employee("Weronika", "Ostrowska", 58, BigDecimal.valueOf(6496)),
                new Employee("Piotr", "Adamski", 51, BigDecimal.valueOf(7022)),
                new Employee("Jeremiasz", "Jędrzejewski", 37, BigDecimal.valueOf(6730)),
                new Employee("Zuzanna", "Głowacka", 32, BigDecimal.valueOf(3221)),
                new Employee("Kinga", "Matusiak", 39, BigDecimal.valueOf(5998)),
                new Employee("Alicja", "Janiszewska", 44, BigDecimal.valueOf(2719)),
                new Employee("Michał", "Socha", 45, BigDecimal.valueOf(4595))
        );
    }
}
