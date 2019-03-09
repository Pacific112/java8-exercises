package _1_warmup;

public class Person {

    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static Person maciek() {
        return new Person("Maciej", "Koziara", 26);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person setAge(int age) {
        return new Person(name, surname, age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
