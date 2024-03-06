package com.kk.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    @Test
    public void test1() {
        List<String> list = new ArrayList<String>();
        list.add("zs");
        list.add("ls");
        list.add("ww");

        for(String ele : list) {
            System.out.println(ele);
        }

        System.out.println("***********");

        list.stream().filter(s -> s.equals("ls")).forEach(s -> System.out.println(s));
    }
}
