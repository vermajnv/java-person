package com.mycomp.in.intities;

import java.util.List;

public interface ICourse extends ISubject{
    public String id();
    public String duration();
    public List<ISubject> subjects();
}
