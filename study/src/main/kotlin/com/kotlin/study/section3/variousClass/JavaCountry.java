package com.kotlin.study.section3.variousClass;

public enum JavaCountry {

	KOREA("KO"),
	AMERICA("US");
	private final String code;

	JavaCountry(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
