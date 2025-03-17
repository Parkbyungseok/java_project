package com.grepp.library.c_collection.b_list.grepp;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class _ArrayList<E> implements Iterable<E>, _List<E> {

    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int pointer; //size(현재 저장된 요소 개수)
    private int arraypointer; //배열 크기

    public _ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
        arraypointer = DEFAULT_CAPACITY;
    }

    public void add(int index, E element) {
        // 1. 특정 인덱스에 값 대입하기
        // 오류 처리
        if(index < 0 || index>pointer) throw new IndexOutOfBoundsException();
        // 2. 크기가 꽉참?
        if(pointer>=arraypointer){
            arraypointer *=2;
            Object[] temporary = new Object[arraypointer];
            for(int i=0;i<pointer;i++){
                temporary[i] = elementData[i];
            }
            //대입
            //원래 배열은 크기 고정 이런 문법이 불가능
            //but 객체 배열이기에 heap영역에 주소값을 가지고 있는 것이기에
            //아래 문법이 가능
            elementData = temporary;
        }
        //한칸씩 뒤로
        for(int i=pointer;i>index;i--){
            elementData[i] = elementData[i-1];
        }
        elementData[index] = element;

        pointer++;
    };

    public boolean add(E e) {

        if (pointer < arraypointer) {
            elementData[pointer] = e;
            pointer++;
            return true;
        }
        arraypointer *= 2;
        Object[] temp = new Object[arraypointer];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }
        temp[pointer] = e;
        elementData = temp;
        pointer++;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= pointer) {
            throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        }
        return (E) elementData[index];
    }

    public E set(int index, E value) {
        if (index < 0 || index >= pointer) {
            throw new IndexOutOfBoundsException("인덱스 범위 벗어남");
        }
        elementData[index] = value;
        return (E) elementData[index];

    }

    public void remove(int index) {
        if (index < 0 || index >= pointer) {
            throw new IndexOutOfBoundsException("인덱스 범위 벗어남");
        }
        for (int i = index; i < pointer - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        pointer--;
    }

    public int size() {
        return pointer;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            private int pointer;

            @Override
            // 다음 요소 확인(있으면 true, 없으면 false)
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            //현재 요소 가져오고, 다음 pointer 증가
            public E next() {
                if (pointer >= size()) {
                    throw new NoSuchElementException();
                }
                E e = get(pointer);
                pointer++;
                return e;
            }
        };

    }
}
