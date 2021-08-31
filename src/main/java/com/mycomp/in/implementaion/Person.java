package com.mycomp.in.implementaion;

import com.mycomp.in.intities.IPerson;

public class Person implements IPerson{

    private String uuid;
    private String name;
    private String address;
    
    public Person(String uuid, String name, String address){
        this.uuid = uuid;
        this.name = name;
        this.address = address;
    }

    @Override
    public String uuid() {
        return this.uuid;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String address() {
        return this.address;
    }

    @Override
    public String changeAddress(String newAddress) {
        this.address = newAddress;
        return this.address;
    }
}
