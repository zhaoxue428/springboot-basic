package com.zhaoxue.learnspringframwork;

// POJO:plain old java object;任何java的对象都是pojo
// no constraints
class Pojo {
	private String text;
	private int number;

	@Override
	public String toString() {
		return text + ":" + number;
	}
}


public class PojoTest {
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);
	}
}