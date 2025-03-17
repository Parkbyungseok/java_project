package com.grepp.library.a_wrapper;

// NOTE AA01 Wrapper class
// 순수 OOP 언어 : 모든 것이 객체로 이루어진 언어
// 자바는 원시타입이 있기 때문에 순수 OOP 언어가 아니다.
// Wrapper class : 자바가 원시 타입을 객체로 대체할 수 있도록 제공해주는 클래스
public class Run {

    public static void main(String[] args) {

        // wrapper class 와 원시타입간의 변환이 자동으로 제공
        // auto boxing : 원시타입을 wrapper 객체로 변환
        // auto unboxing : wrapper 객체를 원시타입 변환

        Boolean activated = true;
        Character ch = 'A';
        Byte bNum = 100;
        Short sNum = 100;
        Integer num = 10000;
        Long lNum = 100000L;
        Float fNum = 100.0f;
        Double dNum = 1000.0;

        // NOTE AA01 : wrapper 객체는 초기화하지 않을 경우, false, 0 대신 null 이 들어간다.
        // wrapper 쓰는 이유 ? 컬렉션 활용에 wrapper 필요함
        // 원시형은 null 값을 가질 수 없지만, wrapper 클래스는 null 가능
        // 메서드와 유틸리티 기능 제공(ex) 문자열 -> 숫자로 변환))
        A_wrapper wrapper = new A_wrapper();
        System.out.println(wrapper);



    }

}
