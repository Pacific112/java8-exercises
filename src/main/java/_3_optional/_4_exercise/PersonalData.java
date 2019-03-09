package _3_optional._4_exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class PersonalData {

    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;

    public PersonalData(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Optional<String> getInfo() {
        if (getAge() > 18) {
            return Optional.of(String.format("Imię: %s, Nazwisko: %s, Data Urodzenia: %s, Wiek: %s", name, surname, dateOfBirth, getAge()));
        }

        return Optional.empty();
    }

}
