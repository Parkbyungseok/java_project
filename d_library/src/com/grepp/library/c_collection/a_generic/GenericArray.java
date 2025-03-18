package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Device;

// NOTE A01 : Generic
// 클래스 외부에서 클래스 내부에서 사용할 타입을 결정하는 것
// 클래스 선언부나 메서드 선언부에 <Generic 매개변수>를 선언해 사용 가능
// Generic 은 여러개 사용할 수 있다.
public class GenericArray<E> {

    //외부에서 직접 수정하는 것을 막고 싶음 -> 캡슐화
    private Object[] elements;
    private int size; //생성할 배열 크기
    private int pointer; //현재 배열에 있는 저장된 요소 개수

    //생성자를 통한 배열 선언
    public GenericArray(int size) {
        this.size = size;
        elements = new Object[size];
    }

    // NOTE 02 제네릭 메서드
    // static <T> 에서 T는 클래스에 선언된 E 타입이 아닌
    // 독자적으로 다른 타입을 사용하겠다고 선언하는 부분!
    // 만약 T를 선언하지 않는다면 , 오류 발생

    //배열에 add 불가 but Object 타입이기에 add 가능
    public static <T> GenericArray<T> practiceGeneric(T e){
        GenericArray<T> instance = new GenericArray<>(10);
        instance.add(e);
        return instance; //반환 값은 <T>를 가지고 있는 제네릭Array
    }

    // NOTE 03 타입 한정 키워드
    // T extends Device : Device 타입을 포함한 후손 타입
    public static <T extends Device> GenericArray<T> practiceExtends(T e){
        GenericArray<T> instance = new GenericArray<>(10);
        instance.add(e);
        return instance; //반환 값은 <T>를 가지고 있는 제네릭Array
    }
    
    public int size() {
        return size;
    }

    public void add(E e) {
        if (pointer == size) {
            System.out.println("용량 부족");
            return; //return 을 만나면 아무 결과 없이 호출된 곳으로 이동
        }
        elements[pointer] = e;
        pointer++;

    }

    public E get(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        return (E) elements[idx];
    }
}
