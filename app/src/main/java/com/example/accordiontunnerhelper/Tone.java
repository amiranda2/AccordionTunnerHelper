package com.example.accordiontunnerhelper;

public enum Tone{
    C(-9), Cs(-8), D(-7), Ds(-6), E(-5), F(-4), Fs(-3), G(-2), Gs(-1), L(0), Ls(1), B(2), Bs(3);

    private final int value;

    private Tone(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
