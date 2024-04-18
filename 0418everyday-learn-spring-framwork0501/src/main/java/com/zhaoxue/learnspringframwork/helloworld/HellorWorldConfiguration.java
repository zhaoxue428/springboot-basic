package com.zhaoxue.learnspringframwork.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record是特殊的类，封装不可变的数据；这个类自动为您生成所有字段的构造器
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HellorWorldConfiguration {

	@Bean
	public String name() {
		return "testMethodCall";
	}

	@Bean
	public int age() {
		return 12;
	}

	// person方法；创建了一个Person的实例
	@Bean
	public Person person() {
		return new Person("Lily", 20, new Address("Main Street", "Kyoto"));
	}
	
	// 想用现有的name和age
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	// 使用现有的bean创建新bean
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}

	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}

	// 为bean配置自己的自定义名称
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("107-0052", "Tokyo");
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("111-8340", "Kyoto");
	}

}
