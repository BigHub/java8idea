package com.java8.helloidea.collections;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jianwei on 16/7/9.
 *  **** 注意:尽管不反对使用Stack,但是ArrayDeque是更好的选择.****
 */
public class StackDemo {
    private static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    private static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]) {
//        注意:尽管不反对使用Stack,但是ArrayDeque是更好的选择.
        ArrayDeque<Integer> de = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();

        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
