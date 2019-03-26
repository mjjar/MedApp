package pl.miloszjarmula.medapp.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String adress;
    private LocalDate dateOfBirth;
    private String sepcialization;
    //private List<String> services; // to bedzie wiazanie
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment = new ArrayList<>();

    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSepcialization() {
        return sepcialization;
    }

    public void setSepcialization(String sepcialization) {
        this.sepcialization = sepcialization;
    }


//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
}