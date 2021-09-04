package com.mycomp.in.intities;

public interface IStudent extends IPerson{
    public String rollNumber();
    ICourse course();
    ICollege college();
    IPerson person();
}
