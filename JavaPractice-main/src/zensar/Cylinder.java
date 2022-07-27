package xyz;
import java.util.*;
import java.math.*;


public class Cylinder extends Circle {

	public double height;
	
	public double volume() {
		
		return area()*height;
	}
}
