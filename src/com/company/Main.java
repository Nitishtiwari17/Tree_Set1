package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        TreeMap<String,String>tree_map1=new TreeMap<String,String>();
        tree_map1.put("C1","Red");
        tree_map1.put("C2","Green");
        tree_map1.put("C3","Black");
        tree_map1.put("C4","White");
        Set<String> Keys=tree_map1.keySet();
        for(String key:Keys){
            System.out.println(key);
        }
	// write your code here
    }
}
