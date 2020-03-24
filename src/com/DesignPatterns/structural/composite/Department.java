package com.DesignPatterns.structural.composite;

import java.util.ArrayList;

public class Department {
    private ArrayList<Specialty> departmentSpecialities = new ArrayList<>();

    public void addSpeciality(Specialty specialty){
        departmentSpecialities.add(specialty);
    }

    public void removeSpeciality(Specialty specialty){
        departmentSpecialities.remove(specialty);
    }

    public void createDepartment(){
        System.out.println("Creating department:");
        for (Specialty specialty :
                departmentSpecialities) {
            specialty.launchSpeciality();
        }
    }
}
