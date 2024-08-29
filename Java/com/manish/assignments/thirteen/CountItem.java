package com.manish.assignments.thirteen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountItem<T> {
	private HashMap<T, Integer> map;
	
	CountItem(T[] input){
		this.map = new HashMap<>();
		
		for(int i=0;i<input.length;i++) {
			if(map.containsKey(input[i])) {	
				int val=map.get(input[i]);
				map.replace(input[i], val+1);
			}
			else {
				 map.put(input[i], 1);
			}
		}		
	}
	
	public HashMap<T, Integer> getMap(){
		return this.map;
	}
}
