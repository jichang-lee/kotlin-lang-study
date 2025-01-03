package com.kotlin.study.section3.Inheritance.javaPack;

public interface JavaFlyable {

	default void act() {
		System.out.println("파닥 파닥");
	}
}
