package com.grepp.library.c_collection.c_set.grepp;

import java.util.Arrays;

public class _HashSet_p1<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    private Object[] elementData;
    private int size;

    //생성자를 통한 배열 초기화
    public _HashSet_p1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private int hash(E e){
        //객체를 알아서 int로 바꿔줌
        // hashCode : -21억 ~ +21억
        //0~21억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode());
        //나머지를 사용해서 0~9로 고정했기 때문에 해시 충돌 문제
        return hashCode % arraySize;
    }

    public boolean add(E e){
        //인덱스로 바뀜(나머지를 통한 0~9로 고정했기 때문에)
        //배열이 가득 차지 않았을 때 배열을 확장
        if(size == arraySize-1) {
            resize();
        }
        int index = hash(e);

        //이미 같은 요소가 존재한다면?
        if(elementData[index] != null){
            return false;
        }
        elementData[index] = e;
        size++;
        return true;
    }
    public boolean remove(E e){
        int index = hash(e);
        if(elementData[index] == null) return false;
        elementData[index] = null;
        size --;
        return true;
    }
    @Override
    public String toString(){
        return Arrays.toString(elementData);
    }

    private void resize() {
        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        //순서 보장x -> 쉽게 옮길 수 없음
        for(int i=0;i<elementData.length;i++){
            if(elementData[i]==null) continue;
            int newIndex = hash((E) elementData[i]);
            temp[newIndex] = elementData[i];
        }
        elementData = temp;
    }

}
