package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class d_1_MapInterface {


    public static void main(String args[]) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("a", 200);
        hm.put("a", 350);
        hm.put("c", 100);
        hm.put("d", 400);
        hm.put(null, 245);

        // Returns Set view
        Set<Map.Entry<String, Integer>> st = hm.entrySet();

        for (Map.Entry<String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


        Map<String, Integer> tree_map = new TreeMap<>();
    }
}

