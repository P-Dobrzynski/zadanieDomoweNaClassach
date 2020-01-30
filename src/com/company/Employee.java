package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String name;
    private String surname;
    private Address address;
    private int age;
    private String gender;
    private String departement;
    private LocalDate startOfEmployment;
    private LocalDate endOfEmployment;
    private LocalDate localDate = LocalDate.now();

    public Employee(String name, String surname, Address address, int age, String gender, String departement, LocalDate startOfEmployment, LocalDate endOfEmployment) {
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.age=age;
        this.gender=gender;
        this.departement=departement;
        this.startOfEmployment=startOfEmployment;
        this.endOfEmployment=endOfEmployment;

    }

    public void getEmploymentDuration() {
        long employmentDuration = ChronoUnit.DAYS.between(startOfEmployment, endOfEmployment);
        if(endOfEmployment.compareTo(localDate) == 0) {
            System.out.println("pracownik pracuje od: " + startOfEmployment);
        }else {
            System.out.println(name + " worked for: " + employmentDuration + " days");
        }
    }

    public LocalDate getLocalDate() {
        return localDate;
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

    public String getGender() {
        return gender;
    }

    public String getDepartement() {
        return departement;
    }

    public LocalDate getStartOfEmployment() {
        return startOfEmployment;
    }

    public LocalDate getEndOfEmployment() {
        return endOfEmployment;
    }
}

