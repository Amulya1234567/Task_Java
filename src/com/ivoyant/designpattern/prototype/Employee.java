package com.ivoyant.designpattern.prototype;


public class Employee {
    private String name;
    private int age;
    private int id;

    public Employee(){
        this.name="Aishu";
        this.age=22;
        this.id=1;
    }

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
//with the help of clone method
//    public Employee clone(){
//        Employee copy=new Employee(this.name,this.age,this.id);
//        return copy;
//    }

//    with the help of copy constructor

    public Employee(Employee e){
        this.name=e.name;
        this.age=e.age;
        this.id=e.id;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
