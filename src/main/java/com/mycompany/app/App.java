package main.java.com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;

public class App 
{
	
public static boolean calculate(ArrayList<Integer> arr1,ArrayList<Integer> arr2,Integer i1,Integer i2){
	ArrayList<Integer> newarr=new ArrayList<Integer>();
	for(Integer i:arr1) {
		newarr.add(i);
	}
	for(Integer j:arr2) {
		newarr.add(j);
	}
	int counter=0;
	Collections.sort(newarr);
	for(Integer t:newarr) {
		if(t.equals(i1))
			counter++;
	}
	if(counter==i2)
		return true;
	return false;
}
}