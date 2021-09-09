package com.mycomp.in;

import static com.mycomp.in.comman.Logger.log;

import java.util.ArrayList;
import java.util.List;

import com.mycomp.in.implementaion.College;
import com.mycomp.in.implementaion.Course;
import com.mycomp.in.implementaion.Subject;
import com.mycomp.in.intities.ICollege;
import com.mycomp.in.intities.ICourse;
import com.mycomp.in.intities.ISubject;

public class TestCollege {
    public void testCollege(){
        log("In Test College", "Testing colleges");
        //ISubject[] subjects = { new Subject("0001", "Maths"), new Subject("0002", "Physics")};
        List<ISubject> subjects = new ArrayList<ISubject>();
        subjects.add(new Subject("001", "Maths"));
        subjects.add(new Subject("002", "Physics"));
        //ICourse[] courses = { new Course("121","4", subjects), new Course("122", "4", subjects)};
        List<ICourse> courses = new ArrayList<ICourse>();
        courses.add(new Course("121", "4", subjects));
        courses.add(new Course("122", "5", subjects));
        ICollege college = new College("111", "United", "Allahabad", courses);
        //college.takeAdminssion(person)
    }  
}


