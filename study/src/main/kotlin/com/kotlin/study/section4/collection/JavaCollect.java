package com.kotlin.study.section4.collection;

import java.util.HashMap;
import java.util.Map;

public class JavaCollect {

	public static void main(String[] args) {
		int[] array = {100,200};

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s %s", i , array[i]);
		}

		HashMap<Integer, String> oldMap = new HashMap<>();
		oldMap.put(1,"MONDAY");
		oldMap.put(2,"TUESDAY");
		//JDK 9 이상
		Map.of(1, "MONDAY",2,"TUESDAY");
	}
}
