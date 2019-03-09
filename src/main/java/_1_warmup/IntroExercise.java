package _1_warmup;

public class IntroExercise {

    // TODO: Warm up exercise
    //       1. Utwórz klasę Person reprezentującą osobę. Powinna zawierać następujące informację: imię, nazwisko, wiek
    //       2. Wypisz informacje o osobie na ekran
    //       3. Do klasy Person dodaj metodę isAdult(), która zwróci informację czy osoba jest pełnoletnia czy nie
    public static void main(String[] args) {
        Person maciek = Person.maciek();
        Person patryk = new Person("Patryk", "Strózik", 14);
        Person olderPatryk = patryk.setAge(19);

        System.out.println(maciek);
        System.out.println(maciek.isAdult());
        System.out.println(patryk);
        System.out.println(patryk.isAdult());
        System.out.println(olderPatryk);
        System.out.println(olderPatryk.isAdult());
    }
}