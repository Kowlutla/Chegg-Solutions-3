package com.chegg.atoms;

public abstract class Element
{
	String symbol;

	int atomicNumber;

	double atomicWeight;

	public Element(String s, int an, double aw)
	{
		// write your code here
		this.symbol=s;
		this.atomicNumber=an;
		this.atomicWeight=aw;
	}

	public String getSymbol()
	{
		// write your code here
		return symbol;
	}

	public int getAtomicNumber()
	{
		// write your code here
		return atomicNumber;
	}

	public double getAtomicWeight()
	{
		// write your code here
		return atomicWeight;
	}

	public abstract void describeElement();

}