package com.mycomp.in.intities;

public interface IPerson {
    String uuid();
    String name();
    String address();
    String changeAddress(String newAddress);
}
