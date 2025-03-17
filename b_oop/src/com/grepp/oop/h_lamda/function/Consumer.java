package com.grepp.oop.h_lamda.function;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t); //추상 메서드 한개, 값 전달받는데 전달x
}
