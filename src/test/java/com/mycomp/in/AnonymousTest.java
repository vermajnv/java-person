package com.mycomp.in;

import com.mycomp.in.implementaion.Anonymous;
import static com.mycomp.in.comman.Logger.log;

public class AnonymousTest {
    public void testAnonymous()
    {
        Anonymous anonymous = new Anonymous();
        log("Data is", anonymous.data);
        log("Here in anonymous :", "Testing");
    }
}
