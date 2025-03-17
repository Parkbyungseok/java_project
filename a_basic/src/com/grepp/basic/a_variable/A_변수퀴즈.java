package com.grepp.basic.a_variable;

public class A_변수퀴즈 {

    public static void main(String[] args) {
        // 퀴즈
        char a = '자';
        char b = '기';
        /// ///////////
        char tem; //임시 저장소

        System.out.println("=== 수정전 ===");
        System.out.println(a); //자
        System.out.println(b); //기

        tem = a; //tem에 '자' 넣기
        a = b; //a에 '기' 넣기
        b = tem; //b에 '자' 넣기

        System.out.println("=== 수정후 ===");
        System.out.println(a); //기
        System.out.println(b); //자

        /// ///////////
    }

}
