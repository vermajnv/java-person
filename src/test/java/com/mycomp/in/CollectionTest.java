package com.mycomp.in;
import java.util.List;
// List<-Collection<-Iterable
public class CollectionTest {
    public void testCollection(){
        var numbers = List.of(1, 2, 3);
        System.out.println("------------Start----------");
        
        for(var number : numbers) {
            System.out.println(number);
        }
        System.out.println("----------End-----------");

        System.out.println("------Start Foreach-------");
        numbers.forEach(System.out::println);
    } 
}
