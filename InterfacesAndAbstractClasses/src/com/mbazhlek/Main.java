package com.mbazhlek;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList list = new MyLinkedList(null);
        String listData = "1 7 3 9 2 5 8 0 4 6";

        // returns a string array
        String[] data = listData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());
    }
}
