package com.kotlin.study.section3.accessModifier

class Car(
        // internal 은 바이트 코드상 public 이 된다.
        // 때문에 java 코드에서는 kotlin 모듈의 internal 코드를 가져올 수 있다.
        internal val name: String,
        var owner: String,
        _price: Int
) {
    var price = _price
        private set
}

/**
 * kotlin 에서 package 는 namespace 용이다.
 * java 처럼 가시성 제어 (protected 타입 등) 를 하지 않는다.
 */