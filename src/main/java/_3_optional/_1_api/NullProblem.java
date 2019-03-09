package _3_optional._1_api;

import java.time.LocalDate;
import java.util.Optional;

public class NullProblem {

    public static void main(String[] args) {
        Doctor mikołaj = new Doctor();
        mikołaj.setName("Mikołaj");

        Patient maciek = new Patient();
        maciek.setName("Maciek");

        Patient anastazja = new Patient();
        anastazja.setName("Anastazja");
        anastazja.setDoctor(mikołaj);

        displayDoctor(anastazja);
        displayDoctor(maciek);

        appointVisit(anastazja, LocalDate.now());
        appointVisit(maciek, LocalDate.now());
    }

    private static void displayDoctor(Patient patient) {
        Optional<Doctor> doctor = patient.getDoctor();
        if (doctor.isPresent()) {
            System.out.println(String.format("Patient %s is assigned to %s", patient.getName(), doctor.get().getName()));
        } else {
            System.out.println(String.format("Patient %s does not have a doctor", patient.getName()));
        }
    }

    private static void appointVisit(Patient patient, LocalDate appointmentDate) {
        Optional<Doctor> doctor = patient.getDoctor();
        if (doctor.isPresent()) {
            System.out.println(String.format("The visit has been arranged for patient %s with doctor %s at %s", patient.getName(), doctor.get().getName(), appointmentDate));
        } else {
            System.out.println(String.format("Patient %s does not have a doctor", patient.getName()));
        }
    }
}