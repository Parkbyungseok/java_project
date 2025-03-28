package com.grepp.exception;

import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throw를 하면 JVM이 예외처리를 해준다.
    // 단, 이 경우는 개발자가 예외처리를 하는 것이 아니기 때문에 권장하지 않는다.
    public static void main(String[] args) {
        A_Exception ex = new A_Exception();

        //ex.arithEx();

        //ex.malformedURLEx();

        //ex.throwMalformedURLEx();

        ex.throwNotValidEx(-100);
        System.out.println("예외 처리 이후 코드");

        try {
            ex.throwTimeOutEx();
            System.out.println("클라이언트 안녕?");
        } catch (TimeOutException e) {
            System.out.println("catch 블록입니다.");
            System.out.println("죄송합니다. 연결에 실패하였습니다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("try - catch 처리 이후 코드");


    }

}
