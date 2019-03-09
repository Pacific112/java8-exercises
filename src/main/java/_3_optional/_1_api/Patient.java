package _3_optional._1_api;

import java.util.Optional;

public class Patient {

    private String name;
    private Doctor doctor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Doctor> getDoctor() {
        return Optional.ofNullable(doctor);
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
