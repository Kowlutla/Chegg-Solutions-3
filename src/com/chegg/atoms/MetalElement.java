package com.chegg.atoms;
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class MetalElement extends Element
{

    public MetalElement(String s, int an, double aw)
    {
        // write your code here
    	super(s,an,aw);
    }

    public void describeElement()
    {
		// write your code here
		System.out.println("Element type is: Metal");
		System.out.println("Symbol: " + getSymbol());
		System.out.println("Atomic Number: " + getAtomicNumber());
		System.out.println("Atomic Weight: " + getAtomicWeight());
		System.out.println("Metals are good conductors of heat and electricity.\n");

    }
}