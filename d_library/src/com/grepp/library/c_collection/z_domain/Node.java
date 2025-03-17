package com.grepp.library.c_collection.z_domain;

import java.util.Objects;

public class Node<E> {

    private Node<E> next; //다음 주소 저장
    private E data; //요소의 데이터

    public Node(E data) {
        this.data = data;
    }

    public E data(){
        return data;
    }

    public void setData(E data){
        this.data = data;
    }

    public Node<E> next(){
        return next;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Node<?> node)) {
            return false;
        }
        return Objects.equals(next, node.next) && Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, data);
    }
}
