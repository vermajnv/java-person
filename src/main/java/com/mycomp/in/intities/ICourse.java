package com.mycomp.in.intities;

public interface ICourse extends ISubject{
    public String id();
    public String duration();
    public ISubject[] subjects();
}
