package com.mycomp.in.implementaion;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static List<Person> createPerson(int noOfItems){
        List<Person> person = new ArrayList<Person>();  
        Person p = null;
        for(int i = 0; i < noOfItems; i++){
            p = new Person("UUID_" + (i+1), "name_" + (i+1) , "New Address_" + (i+1));
            person.add(p);
        }
        return person; 
    }
}
