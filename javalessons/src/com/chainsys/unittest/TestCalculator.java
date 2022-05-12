package com.chainsys.unittest;
import com.chainsys.interfaces.MyCalculator;
import com.chainsys.interfaces.ICalculator1;
public class TestCalculator {
    public static void main(String args[]) {
        ICalculator1 c1= new MyCalculator();
        int value= c1.add(9, 5);
        System.out.println(value);
        value = c1.multiply(9, 5);
        System.out.println(value);
        value = c1.divide(9, 5);
        System.out.println(value);
    }

}