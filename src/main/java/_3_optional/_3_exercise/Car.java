package _3_optional._3_exercise;

import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Car {

    private final String brand;
    private final YearMonth date;

    public Car(String brand, YearMonth date) {
        this.brand = brand;
        this.date = date;
    }

    public static Car unknownAge(String brand) {
        return new Car(brand, null);
    }

    public static Car create(String brand, YearMonth date) {
        return new Car(brand, date);
    }


    public String getBrand() {
        return brand;
    }

    public Optional<YearMonth> getDate() {
        return Optional.ofNullable(date);
    }

    public Optional<Long> getAge() {
        if (date == null) {
            return Optional.empty();
        }

        long between = ChronoUnit.YEARS.between(date, YearMonth.now());
        return Optional.of(between);
    }

}
