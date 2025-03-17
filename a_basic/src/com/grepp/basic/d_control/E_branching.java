package com.grepp.basic.d_control;

import java.util.Scanner;

public class E_branching {

    // break : 반복문 즉시 탈출
    // continue : 반복문의 조건식 또는 증감식으로 이동
    public static void main(String[] args) {
        pracBreak();
        pracContinue();
    }

    private static void pracContinue() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("msg : ");
            String msg = sc.nextLine();

            if(msg.equals("바보")){
                System.out.println("금칙어 입니다.");
                continue;
            }

            if(msg.equals("exits")){
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("user: " + msg);
        }
    }

    public static void pracBreak(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("메세지를 입력하세요 : ");
            String msg = sc.next();
            if(msg.equals("exits")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("user: " + msg);
        }
    }

}
