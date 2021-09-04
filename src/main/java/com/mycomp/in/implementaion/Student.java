package com.mycomp.in.implementaion;

import com.mycomp.in.intities.ICollege;
import com.mycomp.in.intities.ICourse;
import com.mycomp.in.intities.IPerson;
import com.mycomp.in.intities.IStudent;

public class Student implements IStudent{

    private String uuid;
    private String name;
    private String address;
    private String rollNumber;
    private ICourse course;
    private IPerson person;
    private ICollege college;

    public Student(String uuid, String name, String address, String rollNumber, ICourse course, IPerson person, ICollege college){
        this.uuid = uuid;
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
        this.course = course;
        this.person = person;
        this.college = college;
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

    @Override
    public String rollNumber() {
        return this.rollNumber;
    }

    @Override
    public ICourse course() {
        return this.course;
    }

    @Override
    public ICollege college() {
        return this.college;
    }

    @Override
    public IPerson person() {
        return this.person;
    }

}
    