package com.mycomp.in.intities;

public interface ICollege {
   public String regNo();
   public String name();
   public String location();
   public ICourse[] courses(); 
   public IStudent[] students();
}
