package com.mycomp.in.implementaion;

import com.mycomp.in.intities.ICollege;
import com.mycomp.in.intities.ICourse;
import com.mycomp.in.intities.IStudent;

public class College implements ICollege{

    private String regNo;
    private String name;
    private String location;
    private ICourse[] courses;
    private IStudent[] students;

    public College(String regNo, String name, String location, ICourse[] courses){
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
    public ICourse[] courses() {
        return this.courses;
    }

    @Override
    public IStudent[] students() {
        return this.students;
    }
    
}
