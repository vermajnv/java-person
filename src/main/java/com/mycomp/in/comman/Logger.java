package com.mycomp.in.comman;

import java.util.Arrays;
import java.util.stream.Stream;

public class Logger {
    static public void log(Object... args){
        Stream<Object> streams = Arrays.stream(args);
 
        String msg = streams.map((Object obj) -> obj.toString()).reduce((finalStr, str) -> finalStr +" -> "+ str).get();
        System.out.println(msg);
    }
}
