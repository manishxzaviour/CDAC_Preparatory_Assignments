package com.manish.assignments.five;

public enum Security {
	weak("Weak",0),satisfactory("Satisfactory",1),good("Good",2),strong("Strong",3);
	private String name;
	private int securityLevel;
	Security(String name,int securityLevel){
		this.name=name;
		this.securityLevel=securityLevel;
	}
	int securityLevel() {
		return this.securityLevel;
	}
}
