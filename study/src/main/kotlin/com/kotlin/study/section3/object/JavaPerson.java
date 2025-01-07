package com.kotlin.study.section3.object;

public class JavaPerson {

	private String name;
	private int age;
	private static final int MIN_AGE = 1;

	public static JavaPerson newBaby(String name) {
		return new JavaPerson(name,MIN_AGE);
	}

	private JavaPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
