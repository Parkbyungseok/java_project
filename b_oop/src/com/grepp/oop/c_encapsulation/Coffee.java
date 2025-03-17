package com.grepp.oop.c_encapsulation;

// NOTE CCoffee 01 : 캡슐화
// 모든 속성을 private 선언해 클래스 외부와 내부를 구분
// Getter/Setter
// Getter : 속성에 저장된 값을 클래스 외부에 전달
// Setter : 속성에 들어갈 값에 대한 검증(validate)

// 클래스 속성에 대한 권한 정의
// Getter/Setter : 속성에 대한 읽고 쓰기 권한
// Getter        : 속성에 대한 읽기 권한
//               : 속성을 숨김
public class Coffee {
    //private을 통해 외부에서 접근 불가하게 막아줌
    private String name;
    private int price;
    private int cost;
    private int stock;
    private int safetyStock;
    private int salesCnt;

    public Coffee() {
    }

    // Getter는 값을 반환(외부로 반환)
    // Setter는 값을 설정(값 변경 역할)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost<0) return;
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock<0) return;
        this.stock = stock;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(int safetyStock) {
        this.safetyStock = safetyStock;
    }

    public int getSalesCnt() {
        return salesCnt;
    }

    public void setSalesCnt(int salesCnt) {
        this.salesCnt = salesCnt;
    }
}
