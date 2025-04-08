package com.ivoyant.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee.Builder("John", "Doe")
                .email("john.doe@example.com")
                .department("Engineering")
                .salary(75000)
                .build();

        Employee employee2 = new Employee.Builder("Jane", "Smith")
                .department("HR")
                .build();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}

