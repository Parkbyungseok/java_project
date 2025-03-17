package com.grepp.library.c_collection.e_stack;

import java.util.Stack;

public class Run {

    public static void main(String[] args) {
        _Stack<Integer> stack = new _Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        //가장 위에 있는 요소 확인
        System.out.println("peek : " +stack.peek());

        for (int i = 0; i < 10; i++) {
            System.out.println(stack);
            System.out.println(stack.pop());
        }
    }

}
