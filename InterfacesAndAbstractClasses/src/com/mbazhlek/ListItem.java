package com.mbazhlek;

public abstract class ListItem {
    ListItem nextListItem = null;
    ListItem previousListItem = null;
    private Object value;

    ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
