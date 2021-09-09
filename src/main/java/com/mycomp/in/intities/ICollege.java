package com.mycomp.in.intities;

import java.util.List;

public interface ICollege {
   public String regNo();
   public String name();
   public String location();
   public List<ICourse> courses(); 
   public IStudent[] students();
}
