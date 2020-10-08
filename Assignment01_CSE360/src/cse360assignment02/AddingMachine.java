// Taylor Kelly 
// October 7, 2020
// CSE 360, Th 9:00am

package cse360assignment02;

public class AddingMachine {

	// running total of the object
	private int total; 
	
	// string that hold the history of adds/subtracts
	private String str = "0";
	
	// constructor that sets total to 0
	public AddingMachine() {
		
		total = 0; 
	}
	
	// returns the value of total
	public int getTotal () {
		
		return this.total;
	}
	
	// adds the parameter value to the current total
	public void add (int value) {
		
		total += value;
		str = str + " + " + value; 
	}

	// subtracts the parameter value from the current total
	public void subtract (int value) {
		
		total -= value; 
		str = str + " - " + value;
	}
	
	// returns the string that keeps track of previous adds/subtracts
	public String toString () {
		
		return str;
	}

	// sets total to 0, erases history
	public void clear() {
		
		this.total = 0; 
		str = "0";
		
	}
		
}
