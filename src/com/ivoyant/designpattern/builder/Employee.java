package com.ivoyant.designpattern.builder;

public class Employee {
        private final String firstName;   // required
        private final String lastName;    // required
        private final String email;       // optional
        private final String department;  // optional
        private final double salary;      // optional


        private Employee(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.department = builder.department;
            this.salary = builder.salary;
        }

        //Static inner Builder class
        public static class Builder {
            // required fileds
            private final String firstName;
            private final String lastName;

            // optional fields
            private String email;
            private String department;
            private double salary;

            // constructor with required fields
            public Builder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            // chainable setters for optional fields
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public Builder department(String department) {
                this.department = department;
                return this;
            }

            public Builder salary(double salary) {
                this.salary = salary;
                return this;
            }

            public Employee build() {
                return new Employee(this);
            }
        }

        // Optional: toString() for display
        @Override
        public String toString() {
            return "Employee {" +
                    "firstName='" + firstName +
                    ", lastName='" + lastName +
                    ", email='" + email +
                    ", department='" + department +
                    ", salary=" + salary +
                    '}';
        }
    }


