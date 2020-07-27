package com.sugu.solution.at20200724;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Gu Quanye
 * @Date: 2020/7/24 11:32 下午
 * @Number: 290
 * @Link: https://leetcode-cn.com/problems/word-pattern/
 */
public class 单词规律290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("aaaa","dog cat cat dog"));
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        char[] cs = pattern.toCharArray();
        if(arr.length != cs.length){
            return false;
        }
        HashMap<Character, List<Integer>> map = new HashMap();
        HashMap<String, List<Integer>> map2 = new HashMap();

        for(int i = 0; i< cs.length;i++){
            char c = cs[i];
            List<Integer> list = map.getOrDefault(c,new LinkedList<>());
            list.add(i);
            map.put(c,list);
        }
        for(int i = 0; i< arr.length;i++){
            String c = arr[i];
            List<Integer> list = map2.getOrDefault(c,new LinkedList<>());
            list.add(i);
            map2.put(c,list);
        }
        if(map.keySet().size() != map2.keySet().size()){
            return false;
        }
        for(int i = 0;i< map.keySet().size();i++){
        }
        return true;
    }
}
