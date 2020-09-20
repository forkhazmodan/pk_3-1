package com.kp.chukhnovm.hw3_1.Interfaces;

public interface CompatibleCSV<T> {

    public String toCSVString();

    public Object fromCSVString (String string);
}
