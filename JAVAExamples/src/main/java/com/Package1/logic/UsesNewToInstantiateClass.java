package com.Package1.logic;

public class UsesNewToInstantiateClass {
	public String createThing() {

	    AnyOldClass myclass = new AnyOldClass();

	    String returnValue = myclass.someMethod();
	    return returnValue;
	}
}
