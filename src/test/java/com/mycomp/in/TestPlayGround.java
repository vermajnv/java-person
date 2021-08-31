package com.mycomp.in;

import static com.mycomp.in.comman.Logger.log;
import com.mycomp.in.implementaion.Person;

public class TestPlayGround {

    public void testPerson(){
        Person p = new Person("001", "Nayan Verma", "Lakhimpur Kheri");
        log("Start here : ", "Test Person");
        String address = p.address();
        String name = p.name();
        String uuid = p.uuid();

        assert uuid.equals("001") : "Actual uuid does not match with the expected one";
        assert name.equals("Nayan Verma") : "Actual name does not match with the expected one";
        assert address.equals("Lakhimpur Kheri") : "Actual address does not match with the expected one"; 
    } 
}
