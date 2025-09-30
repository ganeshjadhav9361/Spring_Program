package org.program;
import java.util.*;

public class School {
	private Map<Integer,String> name;
	public void setName(Map<Integer,String> name) {
		this.name= name;
	}
	
	public void show() {
		
		Set<Map.Entry<Integer, String>> set= name.entrySet();
		for(Map.Entry<Integer, String> m: set) {
			
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
