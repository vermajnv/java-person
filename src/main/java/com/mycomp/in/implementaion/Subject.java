package com.mycomp.in.implementaion;
import com.mycomp.in.intities.ISubject;

public class Subject implements ISubject{

    private String id;
    private String name;

    public Subject(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }
    
}
