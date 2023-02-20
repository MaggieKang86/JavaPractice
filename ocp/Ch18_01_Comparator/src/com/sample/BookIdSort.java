package com.sample;

import java.util.Comparator;

public class BookIdSort implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return new Integer(o1.getId()).compareTo(o2.getId());
    }

}
