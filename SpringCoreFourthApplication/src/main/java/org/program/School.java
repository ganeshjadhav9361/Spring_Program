package org.program;
import java.util.*;

public class School {
	private List<String> name;
	public void setName(List<String> name) {
		this.name= name;
	}
	
	public void show() {
		for(String n: name) {
			System.out.println(n);
		}
	}
}
