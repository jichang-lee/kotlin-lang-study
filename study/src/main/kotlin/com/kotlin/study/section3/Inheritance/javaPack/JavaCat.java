package com.kotlin.study.section3.Inheritance.javaPack;

public class JavaCat extends JavaAnimal{
	public JavaCat(String species) {
		super(species, 4);
	}

	@Override
	public void move() {
		System.out.println("야옹");
	}
}
