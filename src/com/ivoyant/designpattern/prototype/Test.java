package com.ivoyant.designpattern.prototype;

public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee();
//        for clone method
//        Employee e2=e1.clone();

//        for copy constructor
        Employee e2=new Employee(e1);
        System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getId());
        System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getId());
    }
}
