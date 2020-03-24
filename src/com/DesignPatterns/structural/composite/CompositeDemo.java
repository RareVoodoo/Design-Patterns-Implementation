package com.DesignPatterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Department department = new Department();

        Specialty computerScienceSpecialty = new ComputerScienceSpecialty();
        Specialty softwareEngineeringSpecialty= new SoftwareEngineeringSpecialty();

        department.addSpeciality(computerScienceSpecialty);
        department.addSpeciality(softwareEngineeringSpecialty);

        department.createDepartment();
    }
}
