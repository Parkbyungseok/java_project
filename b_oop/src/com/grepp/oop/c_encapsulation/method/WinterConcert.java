package com.grepp.oop.c_encapsulation.method;

public class WinterConcert {

    public void startConcert(){
        System.out.println("겨울 콘서트를 시작합니다.");
        Player player = new Player("바이올린");

        player.play();

        System.out.println("겨울 콘서트 마치겠습니다.");
    }

}
