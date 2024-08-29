//============================================================================
// Name        : four
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to calculate grade of strudent in subjects based on conditions
//============================================================================

package com.manish.assignments.four;

public class Main4 {
	public static void main(String args[]) {
		
		Student manish=new Student("Manish");
		
		System.out.print("\n\n\n");
		for(Subject s:manish.subjects)
			System.out.printf(
					"Student: %1s Roll no.:%2d has grade %3s with marks %4d in subject %5s\n",
					manish.getName(),
					manish.getRoll(),
					s.getGrade().name(),
					s.getMarks(),
					s.getName()
					);
	}
}
