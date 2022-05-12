package com.chainsys.set;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
public static void main(String[] args) {
	ArrayDeque<String>arraydeque=new ArrayDeque<String>();
    arraydeque.push("A");
    arraydeque.push("B");
    arraydeque.push("X");
    arraydeque.push("Z");
    arraydeque.push("D");
    arraydeque.push("X");
    arraydeque.push("Z");
    arraydeque.push("E");
    arraydeque.push("F");
   System.out.println("Before Popping the Stack: "+arraydeque.size());
    while(arraydeque.peek() != null)
    {
        System.out.println(arraydeque.pop()+" ");    
    }
    System.out.println("After Popping the Stack: "+arraydeque.size());
    
    Iterator<String> iterator = arraydeque.iterator();
    while(iterator.hasNext()) {
        System.out.println("\t"+iterator.next());
    }
    Iterator<String> striterator = arraydeque.descendingIterator();
    while(striterator.hasNext()) {
        System.out.println("\t"+striterator.next());
    }
    arraydeque.addFirst("H");
    arraydeque.addLast("I");
    iterator = arraydeque.iterator();
    while(iterator.hasNext()) {
    	System.out.println("\t"+iterator.next());
    }
    /* ---
     * PollFirst-
     * Retrives and removes the first element of this  deque, or
     * return null if this deque is empty
     */
    System.out.println("********PollFirst:"+arraydeque.pollFirst());
    System.out.println(arraydeque);
    System.out.println("********PollLast:");

}
}