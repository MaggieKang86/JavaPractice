package com.bjpowernode.pk4;

import org.junit.Test;

public class TestSealed {

    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doThing();
    }

}
