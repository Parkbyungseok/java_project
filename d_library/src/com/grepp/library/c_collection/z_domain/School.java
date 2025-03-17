package com.grepp.library.c_collection.z_domain;

import java.util.Objects;

public class School implements Comparable<School>{

    private String name;
    private String address;
    private Integer level;

    public School(String name, String address, Integer level) {
        this.name = name;
        this.address = address;
        this.level = level;
    }

    @Override
    public String toString() {
        return "School{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", level=" + level +
            '}';
    }
    // NOTE Cz 제어반전
    // 개발자가 작성한 compareTo 메서드를 Collections 가 호출
    // 정렬을 위한 흐름을 Collections가 제어, 개발자가 작성한 코드는 Collections 에 의해 사용

    // Spring framework : 웹 개발을 위한 A-Z는 미리 구현
    // O, P, Q, R 정도만 개발자에게 구현을 맡김.

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof School school)) {
            return false;
        }
        return Objects.equals(name, school.name) && Objects.equals(address,
            school.address) && Objects.equals(level, school.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, level);
    }

    // Comparable 인터페이스의 역할
    // CompareTo 메서드의 override 를 강제
    // 우리가 정한 정렬기준은 Comparable 인터페이스의 compareTO 메서드를 통해 전달.
    @Override
    public int compareTo(School o) {
        // 1. 학교명으로 오름차순(a,b,c) 정렬될 수 있도록 기준을 변경
        // 2. 1번이 끝나고, 학교레벨로 정렬 하되 , 만약 레벨이 같다면 학교명으로 내림차순 정렬(ㅎ,ㅍ,ㅌ)
        // 학교명으로 비교

        //오름차순? 작은 값 - 큰 값
        //내림차순? 큰 값 - 작은 값
        //음수(this < o)
        //양수(this > o)
        //0 (this == o)
        int nameCompare = this.name.compareTo(o.name);

        int levelCompare = this.level - o.level;

        //레벨 같다면?
        if(levelCompare ==0){
            return o.name.compareTo(this.name);
        }

        return nameCompare; // 학교명 기준 정렬


    }

    public String getName() {
        return this.name;
    }
}
