package com.mycomp.in.implementaion;

import java.util.List;

import com.mycomp.in.intities.ICourse;
import com.mycomp.in.intities.ISubject;

public class Course implements ICourse{

    private String id;
    private String duration;
    private List<ISubject> subjects;
    private String name;

    public Course(String id, String duration, List<ISubject> subjects){
        this.id = id;
        this.duration = duration;
        this.subjects = subjects;
    }
    @Override
    public String id() {
        return this.id;
    }

    @Override
    public String duration() {
        return this.duration;
    }

    @Override
    public String name() {
        return this.name;
    }
    @Override
    public List<ISubject> subjects() {
        return this.subjects;
    }

}
