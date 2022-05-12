package com.chainsys.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ListArrayListDemo {
    
    public static void main(String[] args)
    {
        usingStringArrayList();
        lessonArrayList();
    }

    public static void usingStringArrayList()
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        System.out.println("Initial size of stringArrayList : "+stringArrayList.size());
        try 
        {
            stringArrayList.add("Car");
            stringArrayList.add("Auto");
            stringArrayList.add("Egg");
            stringArrayList.add("Box");
            stringArrayList.add("Doll");
            stringArrayList.add("Fan");
            // will insert a new value
            // Pushing the current value of index 1 to the next index
            stringArrayList.add(1, "Animal");
            stringArrayList.add("Girl");
            stringArrayList.add("Fan");
            System.out.println("Size of stringArrayList after additions : "+stringArrayList.size());
            System.out.println("Contents of stringArrayList :"+stringArrayList);
            // Will replace the value in index 2
            stringArrayList.set(2, "Xenas");
            System.out.println("After set (2) : "+stringArrayList);
            System.out.println("Last Index of : 'Fan' "+stringArrayList.lastIndexOf("Fan"));
            
            // Remove the first instance of "Fan"
            stringArrayList.remove("Fan");
            stringArrayList.remove(2);
            System.out.println("Size after remove(2) :"+stringArrayList.size());
            System.out.println("Contents of stringArrayList :"+stringArrayList);
            // Will reduce the capacity
            stringArrayList.trimToSize();
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
            }
        }
    private static Object getID;
      public static void lessonArrayList() {
    	 ArrayList<Emp> empArrayList = new  ArrayList<Emp>(30);
    	 System.out.println("InitiempArrayList size of empArrayList:"+empArrayList.size());
    	 try {
    		 for(int i=0;i<5;i++) {
    			 Emp e1= new Emp(i);
    			 e1.Name = "Emp"+i;
    			 empArrayList.add(e1);
    		 }
    		 System.out.println("Size of empArrayList after addition:"+empArrayList.size());
    		 Emp e3=(Emp) empArrayList.get(4);
    		 empArrayList.add(e3);
    		 System.out.println("Size of empArrayList after addition:"+empArrayList.size());
    		 Emp e4=new Emp(4);
    		 e4.Name="Elon Musk";
    		 empArrayList.add(new Emp(4));
    		 System.out.println("Freq of[Emp id-4] in ArrayList-"+Collections.frequency(empArrayList, e3));
    		 Iterator<Emp> empIterator =empArrayList.iterator();
    	 while(empIterator.hasNext()) {
    		 Object element = empIterator.next();
    		 Emp e1=(Emp) element;
    		 System.out.println("\t"+e1.getID()+" "+e1.Name);
    	 }
    	 }catch(Exception err) {
    		 System.out.println("ERROR!!!"+err.getMessage());
    	 }
      
      }
}