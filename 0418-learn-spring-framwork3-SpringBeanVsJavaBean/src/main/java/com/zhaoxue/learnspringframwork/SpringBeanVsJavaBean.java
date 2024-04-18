package com.zhaoxue.learnspringframwork;

import java.io.Serializable;

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

// javabean已经很少人使用了，classes adhering to 3 constraints
class JavaBean implements Serializable { // EJB // 3: 正在实现可序列化接口
	// 满足123的要求，那么类的一个实例将成为javabean
	// 1: public no-arg constructor 无参构造函数
	public JavaBean() {
		
	}
	private String text;
	private int number;

	// 2: getters and setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

public class SpringBeanVsJavaBean {
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);
	}
}