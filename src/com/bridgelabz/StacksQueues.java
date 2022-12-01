package com.bridgelabz;
import java.util.LinkedList;

// UC1 - Ability to create a Stack of 56->30->70
public class StacksQueues {
    static LinkedList<String> ll = new LinkedList<>();

    public static void push(String data){
        ll.add(data);
    }

    public static void print(){
        for(String element : ll){
            System.out.println( element );
            System.out.println("--- ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("welcome to stacks and queues program.");

        push("56");
        push("30");
        push("70");
        print();

    }
}
