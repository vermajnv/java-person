package com.mycomp.in.implementaion;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static List<Person> createPerson(int noOfItems){
        List<Person> person = new LinkedList<Person>();  
        Person p = null;
        for(int i = noOfItems; i > 0; i--){
            p = new Person(i+1, "name_" + (i+1) , "New Address_" + (i+1));
            person.add(p);
        }
        return person; 
    }
}
