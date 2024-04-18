package com.zhaoxue.learnspringframwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 配置spring需要管理的东西的方法：configuration的类； -@Configuration
		var context = new AnnotationConfigApplicationContext(HellorWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));

		// 两种从spring上下文检索bean的方法：通过bean名称 or 使用bean的类型来检索它
		System.out.println(context.getBean("address2"));

		// 如果有多个匹配的bean，编译会报错，spring不知道应该选择哪一个?方法是设置：@Primary，来指示哪个最重要
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("person5Qualifier"));
		// print all name of beans 列出spring框架管理的所有bean的方式
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		;
	
		
	}

}
