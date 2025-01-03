package com.kotlin.study.section3.Inheritance.javaPack;

public class JavaPenguin extends JavaAnimal implements JavaSwimable,JavaFlyable {

	private final int wingCount;

	public JavaPenguin(String species) {
		super(species, 2);
		this.wingCount = 2;
	}

	@Override
	public void move() {
		System.out.println("페엉귄");
	}
	@Override
	public int getLegCount() {
		return super.legCount + this.wingCount;
	}

	@Override
	public void act() {
		JavaSwimable.super.act();
		JavaFlyable.super.act();
	}
}
