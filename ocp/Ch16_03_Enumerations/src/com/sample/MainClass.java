package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setState(PowerState.ON);
        computer.setState(PowerState.SUSPEND);
        computer.setState(PowerState.ON);
        computer.setState(PowerState.OFF);

    }

}
