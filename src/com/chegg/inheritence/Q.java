package com.chegg.inheritence;

//class Q that implements Z
public class Q implements Z {

	//providing implementation for all methods
	@Override
	public void methodE() {
		System.out.println("E Constant: " + E_CONSTANT);
	}

	@Override
	public void methodA() {
		System.out.println("A Constant: " + A_CONSTANT);
	}

	@Override
	public void methodF() {
		System.out.println("F Constant: " + F_CONSTANT);

	}

	@Override
	public void methodZ() {
		System.out.println("Z Constant: " + Z_CONSTANT);

	}

}
