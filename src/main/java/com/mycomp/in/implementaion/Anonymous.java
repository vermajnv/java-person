package com.mycomp.in.implementaion;

import com.mycomp.in.intities.IAnonymous;

public class Anonymous {
    IAnonymous data = new IAnonymous(){
        
        @Override 
        public String name(){
            return "Nayan";
        }
    };
}