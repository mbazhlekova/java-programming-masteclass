package com.mbazhlek;

class Node extends ListItem {

    Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextListItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextListItem = item;
        return this.nextListItem;
    }

    @Override
    ListItem previous() {
        return this.previousListItem;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousListItem = item;
        return this.previousListItem;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
