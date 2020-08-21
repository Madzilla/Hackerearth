package com.concur.hackerearth;

import java.util.Arrays;
import java.util.List;

public class FindNthNodeFromLast {
    
    MyLinkedList<Integer> head;
    MyLinkedList<Integer> temp;
    
    public static void main(String [] args) {
         new FindNthNodeFromLast().createList(new Integer [] {1,2,3,4,5});
     new FindNthNodeFromLast().findNthNode(4);
    }

    private void findNthNode(int n) {
        MyLinkedList<Integer> temp1 = head;
        MyLinkedList<Integer> temp2 = head;
        
        int count = 1;
        
        while (temp1 != null && count != n + 1) {
            temp1 = temp1.next;
            count++;
        }
        
        if (temp1 == null) {
            System.out.println("Not a valid input");
        }
        else {
            while (temp1 != null) {
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            System.out.println(n+ " count node from end is: "+ temp2.info);
        }
    }

    private void createList(Integer[] integers) {

        Arrays.asList(integers).stream().forEach(inte -> {
            if (head == null) {
                head = new MyLinkedList(inte, null);
                temp = head;            
            }
            else {
                temp.next = new MyLinkedList(inte, null);
                temp = temp.next;
            }
            
        });
    }

    
}


class MyLinkedList<T> {
    
    T info;
    MyLinkedList next;
    
    MyLinkedList(T info, MyLinkedList next) {
        this.info = info;
        this.next = next;
    }
}
