package com.alibaba.jvm.sandbox.core.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Pair extends ArrayList<Object> {

    public Pair(Object... objects) {
        super(Arrays.asList(objects));
    }

}