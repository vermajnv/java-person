package com.mycomp.in.intities;

public interface IPerson {
    int uuid();
    String name();
    String address();
    String changeAddress(String newAddress);
}
