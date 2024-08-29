//============================================================================
// Name        : thirteen
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to Display duplicated strings and count them
//============================================================================

package com.manish.assignments.thirteen;

import java.util.Map;

public class Main13 {

	public static void main(String[] args) {
		
		CountItem<String[]> s =new CountItem(args);
				
		//print count
		for (Map.Entry<String[], Integer> i : 
            s.getMap().entrySet()) { 
            System.out.println(i.getKey() + " "
                                  + i.getValue()); 
           }
	}

}
