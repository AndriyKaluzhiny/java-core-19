package ua.lviv.lgs;

import java.util.HashMap;

public class MyEntry {
	String s;
	Integer i;
	HashMap<String, Integer> hm = new HashMap<String, Integer>();	
	
	public MyEntry(String s, Integer i) {
		this.s = s;
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	@Override
	public java.lang.String toString() {
		return "MyEntry [s=" + s + ", i=" + i + "]";
	}
}
