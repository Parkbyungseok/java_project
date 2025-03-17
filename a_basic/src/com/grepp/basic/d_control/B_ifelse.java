package com.grepp.basic.d_control;

import java.util.Scanner;

public class B_ifelse {

    // NOTE DB01 양자택일 조건문
    // if(조건식){조건식이 참일 때 수행될 코드블록}
    // else{조건식이 거짓일 때 수행될 코드블록}
    public static void main(String[] args) {

        System.out.println("\n === 인증 === \n");

        String username = "박병석";
        String storedPassword = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("비밀번호 : ");
        String password = sc.next();

        //아이디와 비밀번호 모두 일치하면 인증 성공, 아니면 인증실패

        if(username.equals(name) && (storedPassword.equals(password))){
            System.out.println("환영합니다 " + name + "님!");
            System.out.println("인증에 성공하였습니다.");
        }else{
            System.out.println("인증에 실패했습니다.");
        }


    }

}
