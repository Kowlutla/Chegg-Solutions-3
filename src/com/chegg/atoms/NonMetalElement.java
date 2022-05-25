package com.chegg.atoms;
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class NonMetalElement extends Element {

	public NonMetalElement(String s, int an, double aw) {
		// write your code here
		super(s, an, aw);
	}

	public void describeElement() {
		// write your code here
		System.out.println("Element type is: Non-Metal");
		System.out.println("Symbol: " + getSymbol());
		System.out.println("Atomic Number: " + getAtomicNumber());
		System.out.println("Atomic Weight: " + getAtomicWeight());
		System.out.println(
				"Non-metals are bad conductors of heat and electricity. Except for graphite which is a good conduction of electricity.\n");
	}

}