package com.grepp.basic.a_variable;

public class B_상수 {

    public static void main(String[] args) {

        // NOTE AB01 final
        // final 예약어 : 변경 불가능

        // NOTE AB02 상수 : 초기화 이후 재할당이 불가능한 변수
        // 상수 명명 규칙 : Upper snake 표기법
        // snake 표기법 : 모든 단어를 소문자로 작성 , 각 단어를 연결할 때 _ 를 사용하는 표기법 ex) book_storage
        // Upper snake 표기법 : 모든 단어를 대문자로 작성

        final int API_KEY = 7121455;
        // Cannot assign a value to final variable 'API_KEY'
        // API_KEY = 1;
        System.out.println(API_KEY);

    }
}
