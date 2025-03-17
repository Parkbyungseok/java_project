package com.grepp.library.c_collection.c_set.grepp;

import com.grepp.library.c_collection.z_domain.Node;

@SuppressWarnings("unchecked")
public class _HashSet_p2<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    protected Object[] elementData;
    private int size;

    public _HashSet_p2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    protected int hash(E e){
        //객체를 알아서 int로 바꿔줌
        // hashCode : -21억 ~ +21억
        //0~21억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode());
        //나머지를 사용해서 0~9로 고정했기 때문에 해시 충돌 문제
        return hashCode % arraySize;
    }

    private void resize() {
        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        //순서 보장x -> 쉽게 옮길 수 없음
        for(int i=0;i<arraySize;i++){
            if(elementData[i]==null) continue;
            int newIndex = hash((E) elementData[i]);
            temp[newIndex] = elementData[i];
        }
        elementData = temp;
    }
    //노드 체인 형식으로
    public boolean add(E e){
        Node<E> node = new Node<E>(e);

        //사이즈가 가득 차기전에 배열 크기 확장
        if(size == arraySize-1){
            resize();
        }
        //인덱스 구하기
        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if(head == null){
            elementData[index] = node;
            size++;
            return true;
        }
        Node<E> link = head;
        while(link.next() != null){
            link = link.next();
        }
        while(link.next() != null){
            if(link.equals(node)) return false;
            link = link.next();
        }
        link.setNext(node);
        size++;
        return true;

    }

    public boolean remove(E e){
        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if(head.data().equals(e)){
            elementData[index] = head.next();
            size--;
            return true;
        }

        Node<E> prevNode = head;
        Node<E> link = head;

        while(link.next() != null){
            prevNode =link;
            link=link.next();

            if(link.data().equals(e)){
                prevNode.setNext(link.next());
                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for(int i=0;i< elementData.length;i++){
            if(elementData[i] == null) continue;
            Node<E> link = (Node<E>) elementData[i];

            while(link.next() != null){
                //메서드 연쇄 -> 메서드 체인방식
                sb.append(link.data()).append(",");
                link = link.next();
            }

            sb.append(link.data());
            if(i == elementData.length-1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
