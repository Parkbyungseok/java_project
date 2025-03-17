package com.grepp.library.c_collection.b_list;

import com.grepp.library.c_collection.b_list.grepp._ArrayList;
import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.z_domain.School;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        // NOTE B01 : CRUD
        // 데이터를 조작하는 방법
        // Create , Read, Update , Delete

//        pracAdd();
//        pracGet();
//        pracSet();
//        pracRemove();
//        pracSort();
        pracIterable();
//        UserAdd();



    }

    //iterable
    private static void pracIterable() {
        _LinkedList<Integer> list = new _LinkedList<>();

        for(int i=0; i<10;i++){
            list.add(i);
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(list.get(i));
//
//        }
        for(Integer i : list){
            System.out.println(i);
        }
    }

    private static void pracSort() {
        School seoul = new School("서울대", "관악구", 4);
        School yeonsae = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School grepp = new School("그랩","삼성",2);
        School semyoung = new School("세명초","속초",1);

        //List.of 사용하면 불변, 변경 불가
        List<School> schools = new ArrayList<>(List.of(seoul,yeonsae,minsa,grepp,semyoung));
        List<Integer> nums =  new ArrayList<>(List.of(13,165,22,323,11,988,443));

        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(schools);

        Collections.sort(schools, (a,b) ->a.getName().compareTo(b.getName()));
        System.out.println(schools);


    }

    private static void pracRemove() {
        _ArrayList<Integer> list = new _ArrayList<>();

        for(int i=0; i<10;i++){
            list.add(i);
        }
        
        System.out.println(list);
        list.remove(2);

        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }
        
        // 0,1,2,3 인덱스 삭제
        // 리스트를 나누는 것
//        List<Integer> subList = list.subList(0,4);
//        list.removeAll(subList);
//        System.out.println(list);
    }

    private static void pracSet() {
        School seoul = new School("서울대", "관악구", 4);
        School yeonsae = new School("연세대", "신촌", 4);
        School minsa = new School("민사고", "대전", 3);
        School grepp = new School("그랩","삼성",2);
        School semyoung = new School("세명초","속초",1);

        _LinkedList<School> list = new _LinkedList<>();

        list.add(seoul);
        list.add(yeonsae);

        System.out.println(list.get(0));

        list.set(0, grepp);
        System.out.println(list.get(0));
    }

    private static void pracGet() {
        List<String> list = new ArrayList<>();
        list.add("안녕");
        list.add("hi");
        list.add("hello");

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

    }

    private static void pracAdd() {
        _ArrayList<Integer> list = new _ArrayList<>();

        for(int i=0;i<30;i++){
            list.add(i);
        }
        for (int i = 0; i < 30; i++) {
            System.out.print(list.get(i)+ " ");
        }

//        for(Integer i : list){
//
//        }
        System.out.println("====================");
    }

    private static void UserAdd(){
        _ArrayList<Integer> list = new _ArrayList<>();

        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println("원래 배열 list");
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println(" ");
        System.out.println("==============");
        list.add(1,6);

        System.out.println("특정 인덱스 대입 후 list");
        for(int i=0;i<6;i++){
            System.out.print(list.get(i)+ " ");
        }
    }

}
