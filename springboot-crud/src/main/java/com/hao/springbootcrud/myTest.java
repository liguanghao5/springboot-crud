package com.hao.springbootcrud;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myTest {


    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("电话问诊");
        stringList.add("图文问诊");
        stringList.add("视频问诊");

        List<Map<String,Object>> list = new ArrayList<>();

        Map<String ,Object> map = new HashMap<>();

        map.put("name","图文问诊");

        list.add(map);

        Map<String ,Object> map2 = new HashMap<>();

        map2.put("name","视频问诊");

        list.add(map2);

        Map<String ,Object> map3 = new HashMap<>();

        map3.put("name","电话问诊");

        list.add(map3);

        System.out.println(list);

        List<Map<String,Object>> list2 = new ArrayList<>();

       for (String string : stringList) {

            for (int i = 0; i <list.size() ; i++) {

                Map<String, Object> mapp = list.get(i);

                if (string.equals(mapp.get("name"))){

                    list.remove(i);
                    list2.add(mapp);
                    break;
                }
            }
        }
        if(list.size()>0){
            list2.addAll(list);
        }

        System.out.println(list2);
    }









}
