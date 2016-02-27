package com.androidhero.dagger2test.model;

/**
 * Created by feliperohde on 2/27/16.
 */
public class Motor {

    private int rpm;

    public int getRpm() {
        return rpm;
    }

    public Motor() {
        this.rpm = 0;
    }


    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }
}
