package com.sample;

public class Computer {

    private PowerState state;

    public void setState(PowerState state) {

        this.state = state;

        switch (this.state) {
            case OFF:
                System.out.println(PowerState.OFF);
                break;
            case ON:
                System.out.println(PowerState.ON);
                break;
            case SUSPEND:
                System.out.println(PowerState.SUSPEND);
                break;
//            case SLEEP:
//                System.out.println(PowerState.SLEEP);
//                break;
        }

    }

}
