package com.kotlin.study.section3.nestedClass;

public class JavaHouse {

	private String address;
	private LivingRoom livingRoom;

	public JavaHouse(String address, LivingRoom livingRoom) {
		this.address = address;
		this.livingRoom = new LivingRoom(10);
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}

	public class LivingRoom {
		private double area;

		public LivingRoom(int area) {
			this.area = area;
		}

		public String getAddress() {
			return JavaHouse.this.address;
		}
	}
}
