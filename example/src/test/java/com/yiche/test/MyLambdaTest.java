package com.yiche.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by root on 2018/5/25.
 */
public class MyLambdaTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("aaa");
        strings.add("bbbb");
        long count = strings.stream().filter(m -> m.length() > 3).count();
        System.out.println(count);
        String ss="abcde";
//        Stream<String> s=Stream.of(ss.split("."));
//        s.filter()
        Stream<String> stream = Arrays.stream(ss.split("b"));
//        Optional<String> max = stream.max(
//            String::compareToIgnoreCase);
//        if(max.isPresent()){
//            System.out.println(max.get());
//        }
//        Stream<String> stringStream = stream.map(String::toLowerCase);
//        stream.map(s -> s.charAt(0));
        List<String> collect = stream.collect(Collectors.toList());
        System.out.println(collect);
    }

}
