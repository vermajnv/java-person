package com.mycomp.in;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.mycomp.in.comman.Logger.log;
import com.mycomp.in.implementaion.ListExample;
import com.mycomp.in.implementaion.Person;

public class TestPerson {
    public void testListPerson(){
        List<Person> persons =  ListExample.createPerson(100);
        log("Test Person :", "Test List");
        Person newPerson = new Person(1, "name_12", "New Address_12");
        Boolean stauts = persons.contains(newPerson);
        log("Status : ", stauts);
        log("Size : ", persons.size());
        log("Is Empty : ", persons.isEmpty());
        int index = persons.indexOf(newPerson);
        log("Index of : ", index);
        Person person = persons.get(index);
        log("Show Person : ", person);

        Collections.sort(persons);
        log("Data : Sorted ", persons);
    }    
}
