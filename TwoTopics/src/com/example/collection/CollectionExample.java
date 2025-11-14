package com.example.collection;
import java.util.*;

public class CollectionExample {

	    public static void main(String[] args) {

	        ArrayList<String> names = new ArrayList<>();

	        // Adding names
	        names.add("Arun");
	        names.add("John");
	        names.add("Priya");
	        names.add("Zara");
	        names.add("Karthik");

	        // Sorting
	        Collections.sort(names);
	        System.out.println("Sorted Names: " + names);

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name to search: ");
	        String search = sc.nextLine();

	        // Searching
	        if (names.contains(search)) {
	            System.out.println("Found: " + search);
	        } else {
	            System.out.println("Not Found");
	        }
	        
	        //min and max
	        ArrayList<Integer> nums = new ArrayList<>();
	        nums.add(10);
	        nums.add(5);
	        nums.add(25);
	        nums.add(1);
	        nums.add(30);

	        System.out.println("Numbers: " + nums);
	        System.out.println("Max: " + Collections.max(nums));
	        System.out.println("Min: " + Collections.min(nums));
	        
	        
	        HashMap<Integer, String> map = new HashMap<>();

	        map.put(101, "Arun");
	        map.put(102, "Priya");
	        map.put(103, "Zara");

	        System.out.println("Student Details:");
	        for (Map.Entry<Integer, String> e : map.entrySet()) {
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }

	        int search1 = 102;
	        if (map.containsKey(search1)) {
	            System.out.println("Roll No " + search1 + " found! Name: " + map.get(search1));
	        } else {
	            System.out.println("Roll No " + search1 + " not found.");
	        }
	        
	        
	        
//	        // both key and value
//	        for(Map.Entry<Integer,String> e1: map.entrySet())
//	        {
//	        	System.out.println("Key: "+e1.getKey()+" -> "+" Value: "+e1.getValue() );
//	        }
//	        int search2=103;
//	        
//	        for(Map.Entry<Integer, String>e2:map.entrySet())
//	        {
//	        if (e2.getKey()==search2) {
//	            System.out.println("Roll No " + e2.getKey() + " found! Name: " + e2.getValue());
//	        } else {
//	            System.out.println("Roll No " + e2.getKey() + " not found.");
//	        }
//	        }
	    
	    }
	    
	}

