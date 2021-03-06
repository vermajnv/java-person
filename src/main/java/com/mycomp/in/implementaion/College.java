package com.mycomp.in.implementaion;

import java.util.List;

import com.mycomp.in.intities.ICollege;
import com.mycomp.in.intities.ICourse;
import com.mycomp.in.intities.IPerson;
import com.mycomp.in.intities.IStudent;

public class College implements ICollege{

    private String regNo;
    private String name;
    private String location;
    private List<ICourse> courses;
    private IStudent[] students;

    public College(String regNo, String name, String location, List<ICourse> courses){
        this.regNo = regNo;
        this.name = name;
        this.location = location;
        this.courses = courses;
    }

    @Override
    public String regNo() {
        return this.regNo;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String location() {
        return this.location;
    }

    @Override
    public List<ICourse> courses() {
        return this.courses;
    }

    @Override
    public IStudent[] students() {
        return this.students;
    }
   
    public IStudent takeAdminssion(IPerson person, String rollNumber, ICollege college, ICourse course){
        return new Student(rollNumber, course, person, college);
    }
}
