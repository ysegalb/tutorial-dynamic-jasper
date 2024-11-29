package com.github.io.ysegalb.tutorials.dynamicjasper.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

public class EmployeeHelper {


    // Generación dinámica de una lista de empleados entre 100 y 200
    public static List<Employee> getEmployees() {
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        List<Employee> employees = new ArrayList<Employee>();
        int max = faker.number().numberBetween(100, 200);
        for (int i = 0; i <= max; i++) {
            employees.add(new Employee((long) i, faker.name().firstName(), faker.name().lastName(), String.format("%1$td/%1$tm/%1$tY", faker.date().birthday()), faker.number().randomDouble(2, 1000, 999999) + "€", faker.job().position()));
        }
        return employees;
    }
}