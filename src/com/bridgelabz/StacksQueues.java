package com.bridgelabz;
import java.util.LinkedList;

// Ability to peak and pop from the Stack till it is empty

public class StacksQueues {
    static LinkedList<String> ll = new LinkedList<>();

    public static void push(String data){
        ll.add(data);
    }

    public static void pop(){
        ll.removeLast();
    }
    public static void print(){
        if(ll.size() != 0) {
            for (String element : ll) {
                System.out.println("| " + element + "|");
                System.out.println(" --- ");
            }
            System.out.println();
        } else
            System.out.println("Stack is Null.............");
    }

    public static void main(String[] args) {
        System.out.println("welcome to stacks and queues program.");

        push("56");
        push("30");
        push("70");
        push("70");
        push("70");
        push("70");
        System.out.println("Stack :::::::::::::::::::::");
        print();
        int size = ll.size();
        System.out.println("size " +ll.size());
        for (int i = 0; i < size; i++){
            pop();
        }
        System.out.println("Stack :::::::::::::::::::::");
        print();
    }
}
