package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CustomHashMap<Integer,Integer> hm=new CustomHashMap<>();
        hm.put(1,2);
        hm.put(2,3);
        hm.put(3,4);
        hm.put(4,5);
        hm.put(5,6);

        for(int x:hm.keySet()){
            System.out.println(x+" "+hm.get(x));
        }

        hm.remove(4);
        for(int x:hm.keySet()){
            System.out.println(x+" "+hm.get(x));
        }
    }
}
