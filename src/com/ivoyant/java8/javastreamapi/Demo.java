package com.ivoyant.java8.javastreamapi;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(6,4,5,3,9,8);

        int result=num.stream() //this also return new stream
                .sorted()  //value will be sorted also give new stream
                .filter(n->n%2==1) //filter the data which takes object of predicate returns new stream
                .map(n->n*2) //which takes object of function returns new stream
                .reduce(0,(c,e)->c+e);// it returns a value

        System.out.println(result);
    }
}
