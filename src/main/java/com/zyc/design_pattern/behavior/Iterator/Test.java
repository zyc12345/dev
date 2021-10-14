package com.zyc.design_pattern.behavior.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test implements Iterator {

    static List<Integer> list = new ArrayList<>();

    static int size = 0;

    static {
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
    }


    @Override
    public boolean hasNext() {
        if (size >= list.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Integer integer = list.get(size);
        size++;
        return integer;
    }
}

class yyy{
    public static void main(String[] args) {
        Test test = new Test();
        while (test.hasNext()){
            System.out.println(test.next());
        }
    }
}
