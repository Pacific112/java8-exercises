package _3_optional._2_exercise;

import java.util.Optional;

public class Student {

    private String name;
    private Essay essay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Essay> getEssay() {
        return Optional.ofNullable(essay);
    }

    public void setEssay(Essay essay) {
        this.essay = essay;
    }
}
