package com.chainsys.map;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//Initial capacity is 3 increment it by 2
		Vector<Integer> v= new Vector<Integer>(3,2);
		System.out.println("Intial size:"+v.size());
		System.out.println("Initial capacity:"+v.capacity());
		v.addElement(1);;
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity:"+v.capacity());
		v.addElement(5);
		v.addElement(6);
		System.out.println("Capacity:"+v.capacity());
		v.addElement(4);
		System.out.println("Capacity:"+v.capacity());
		v.addElement(5);
		v.addElement(6);
		System.out.println("capacity :" + v.capacity());
        System.out.println("First element:" + (Integer) v.firstElement());
        System.out.println("Last element: " + (Integer) v.lastElement());
        if (v.contains(3))
            System.out.println("Vector contains 3.");
        Enumeration<Integer>vEnum=v.elements();
        System.out.println("\nElement in vector:");
        while(vEnum.hasMoreElements())
            System.out.println(vEnum.nextElement()+" ");
	}
    }