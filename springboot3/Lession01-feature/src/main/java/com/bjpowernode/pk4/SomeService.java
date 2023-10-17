package com.bjpowernode.pk4;

public sealed interface SomeService permits SomeServiceImpl, OrderService{

    void doThing();

}
