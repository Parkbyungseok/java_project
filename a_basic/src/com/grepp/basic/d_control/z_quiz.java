package com.grepp.basic.d_control;

import java.util.Scanner;

public class z_quiz {

    public static void main(String[] args) {

        // 1P 유저로부터 가위/바위/보 중 하나를 입력받으세요
        // 2P 유저로부터 가위/바위/보 중 하나를 입력받으세요.
        // 1P 유저기준에서 승/패/비김 여부를 출력해주세요.
        Scanner sc = new Scanner(System.in);
        //1p 선택
        System.out.println("가위/바위/보 중 하나를 선택해주세요");
        System.out.print("1P : ");
        String p1 = sc.next();

        //2p 선택
        System.out.println("가위/바위/보 중 하나를 선택해주세요");
        System.out.print("2P : ");
        String p2 = sc.next();

        game(p1, p2);
    }
    //메소드가 static을 붙이는 이유는 z_quiz안에 있는 main에서 바로 사용하기 위함
    //static 메서드 - 객체 생성없이 메서드 사용할 수 있게 해줌
    public static void game(String p1, String p2){
        if(p1.equals("바위") && p2.equals("가위")){
            System.out.println("p1 승리");
        }else if(p1.equals("가위") && p2.equals("보")){
            System.out.println("p1 승리");
        }else if(p1.equals("보") && p2.equals("바위")){
            System.out.println("p1 승리");
        }else if(p1.equals(p2)){
            System.out.println("비겼습니다");
        }else{
            System.out.println("p1 패배");
        }
    }
}


