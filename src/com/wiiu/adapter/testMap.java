package com.wiiu.adapter;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName testMap
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/22 11:18 上午
 * @Version 1.0
 */

public class testMap {

    public static void main(String[] args) throws Exception {
        List<String> userNames = new ArrayList<String>(){{
            add("test1");
            add("test2");
            add("test3");
            add("test4");
        }};
//        for (String s:userNames){
//            if (s.equals("test4")){
//                userNames.remove(s);
//            }
//        }
//
//        Iterator<String> iterator = userNames.iterator();
//        do {
//            if (!iterator.hasNext())
//                break;
//            String userName = iterator.next();
//            if (userName.equals("test1"))
//                userNames.remove(userName);
//        } while (true);
//
//        System.out.println(userNames);


        List<String> a = new CopyOnWriteArrayList<>();
        a.add("test1");
        a.add("test2");
        a.add("test3");
        a.add("test4");

        a = a.stream().filter(userName -> !userName.equals("test1")).collect(Collectors.toList());
        System.out.println(a);
    }

    public static <K, V> HashMap<K,V> newHashMapWithExpectedSize(int expectedSize) {
        return new HashMap<>();
    }

    static int capacity(int expectedSize){
        if (expectedSize <3) {
            return expectedSize +1;
        } else {
            return expectedSize < 1073741824 ? (int)((float)expectedSize / 0.75f + 1.0f) : 2147483647;
        }
    }

}
