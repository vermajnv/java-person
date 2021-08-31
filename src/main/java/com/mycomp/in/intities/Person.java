package com.mycomp.in.intities;

public interface Person {
    String uuid();
    String name();
    String address();
    String changeAddress(String newAddress);
}
