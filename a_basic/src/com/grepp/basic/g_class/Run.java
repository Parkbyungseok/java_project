package com.grepp.basic.g_class;

public class Run {
    public static void main(String[] args) {
        //생성자란? 객체가 생성되는 시점에 값을 초기화해주기 위한 함수
        //변수 앞에 오는 것은 타입 -> 참조형 타입!
        //coffee.name -> .을 통해 특정 주소에 접근 가능
        //클래스를 통해 객체를 만들었다면, 객체를 인스턴스라고 함

        //init();
        classMember();

    }

    private static void classMember() {
        // type에 속한다. -> 인스턴스를 생성하지 않고 타입 정보만으로 사용할 수 있다.
        System.out.println(Coffee.type);
        //Coffee.info();

        Coffee.type = 'F';
        Coffee americano = new Coffee("아메리카노");
        Coffee mocha = new Coffee("모카");

        System.out.println(americano.type);
        System.out.println(mocha.type);
        Coffee.info();


    }

    private static void init() {
        Coffee coffee = new Coffee(
            "americano",
            1000,
            500,
            10,
            3,
            0,
            false
        ); //생성자를 통한 객체 초기화

        System.out.println(coffee.name);
        System.out.println(coffee.price);

    }


}
