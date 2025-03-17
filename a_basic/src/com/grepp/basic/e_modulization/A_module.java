package com.grepp.basic.e_modulization;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class A_module {

    public static void main(String[] args) {

        // 1. 111, 1111, 11111 중에서 최소값 최대값 중간값을 구하는 로직 작성
        System.out.println("min :" + min(111, 1111, 11111));
        mid(111, 1111, 11111);
        System.out.println("max :" + max(111, 1111, 11111));
        System.out.println("=======================================");


        // 2. 222, 2222, 22222 중에서 최소값 최대값 중간값을 구하는 로직 작성
        System.out.println("min :" + min(222, 2222, 22222));
        mid(222,2222,22222);
        System.out.println("max :" + max(222, 2222, 22222));
        System.out.println("=======================================");


        // 3. 333, 3333, 33333 중에서 최소값 최대값 중간값을 구하는 로직 작성
        System.out.println("min :" + min(333, 3333, 33333));
        mid(333,3333,33333);
        System.out.println("max :" + max(333, 3333, 33333));
        System.out.println("=======================================");

        //중간 값 -> 세 값 중에서 , 최대값과 최소값이 아닌 값


        /* 내가 작성한 중간을 구하는 코드
        int mid;
        //경우의 수
        // g h i 자리가 중간일 경우 총 3가지
            //g가 중간일 경우
        if((g>=h && g<=i) || (g>=i && g<=h)){
            mid = g;
            //h가 중간일 경우
        }else if((h<=i && h>=g) || (h<=g && h>=i)){
            mid = h;
            //i가 중간일 경우
        }else{
            mid = i;
        }
        System.out.println("중간값: " + mid);
        */

    }
    // 출력해주는 함수 한번 더 묶기
    public static void printMinMax(int min, int max){
        System.out.println("min :" + min);
        System.out.println("max :" + max);
    }
    // NOTE EA00 모듈 : 작업을 수행하는 독립적인 단위(or 구성요소)
    // 모듈화를 하는 이유:
    // 1. 재사용성
    // 2. 가독성
    // 3. 유지보수가 용이
    // 4. 하나의 모듈이 하나의 책임만 가져야 한다. (가장 우선시 해야함)

    // NOTE *************************************************
    // NOTE EA01 매개변수 : 함수 외부에서 전달되는 값을 받기 위한 변수
    // 매개변수 : 함수 외부에서 전달되는 값을 받기 위한 변수
    // 전달인자 : 매개변수에 전달되는 값
    // 반환값(return) : 함수가 종료될 때 함수의 호출부로 전달할 값,
    // 메서드 선언부의 return type을 명시적으로 지정해야한다.
    public static int min(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
    public static int max(int d, int e, int f){
        int max = f;
        if(max<e){
            max = e;
        }
        if(max<d){
            max = d;
        }
        return max;
    }
    /*
    public static void mid(int g, int h, int i){
        int mid;
        if((g>=h && g<=i) || (g>=i && g<=h)){
            mid = g;
            //h가 중간일 경우
        }else if((h<=i && h>=g) || (h<=g && h>=i)){
            mid = h;
            //i가 중간일 경우
        }else{
            mid = i;
        }
        System.out.println("중간값: " + mid);
    }
     */
    public static void mid(int a, int b, int c) {

        int max = max(a, b, c);
        int min = min(a, b, c);
        if (a != max && a != min) {
            System.out.println("중간값 :" + a);
        }

        if (b != max && b != min) {
            System.out.println("중간값 :" + b);
        }

        if (c != max && c != min) {
            System.out.println("중간값 :" + c);
        }
    }
}
