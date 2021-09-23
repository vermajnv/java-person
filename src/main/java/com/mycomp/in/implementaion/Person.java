package com.mycomp.in.implementaion;

import com.mycomp.in.intities.IPerson;
import static com.mycomp.in.comman.Logger.log;

public class Person implements IPerson, Comparable<Person>{

    private int uuid;
    private String name;
    private String address;
    
    public Person(int uuid, String name, String address){
        this.uuid = uuid;
        this.name = name;
        this.address = address;
    }

    @Override
    public int uuid() {
        return this.uuid;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String address() {
        return this.address;
    }

    @Override
    public String changeAddress(String newAddress) {
        this.address = newAddress;
        return this.address;
    }

    @Override
    public String toString(){
        return "[uuid = " + this.uuid + " Name " + this.name + " Address : " + this.address + "]";
    }

    
    @Override
    public boolean equals(Object newObject)
    {
        if (!(newObject instanceof IPerson)){
            return false;
        }
        Person obj = (Person)newObject;
        log("Data : ", newObject);
        if (obj.name.equals(this.name)) {
            return true; 
        }
        return false;
    }

   // @Override
    //public int compareTo(Object arg0) {
        //// TODO Auto-generated method stub
        //return 0;
    //}

    @Override
    public int compareTo(Person o) {
        return Integer.valueOf(this.uuid).compareTo(Integer.valueOf(o.uuid));
    }
}
