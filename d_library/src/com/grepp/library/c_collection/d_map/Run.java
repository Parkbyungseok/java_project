package com.grepp.library.c_collection.d_map;

import com.grepp.library.c_collection.d_map.grepp._Entry;
import com.grepp.library.c_collection.d_map.grepp._HashMap;
import com.grepp.library.c_collection.z_domain.School;
import com.grepp.library.c_collection.z_domain.SchoolFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Run {

    public static void main(String[] args) {
        List<School> schools = SchoolFactory.createSchools();
        pracPut();
        //pracGet();
    }

    private static void pracGet() {
        System.out.println("===get===");
        HashMap<String, School> map = createSchools();
        System.out.println(map.get("서울대"));
        System.out.println(map.get("연세대"));
        System.out.println(map.get("그랩"));

//        for (Entry<String, School> entry : map.entrySet()){
//            System.out.println("key : " + entry.getKey());
//            System.out.println("value : " + entry.getValue());
//        }

        System.out.println("==============================");

//        for(String key : map.keySet()){
//            System.out.println("key : " + key);
//            System.out.println("value : " + map.get(key));
//        }

        System.out.println("==============================");

//        List<School> list = new ArrayList<>(map.values());
//        for(School school : list){
//            System.out.println(school);
//        }
    }

    private static HashMap<String, School> createSchools() {
        HashMap<String, School> map = new HashMap<>();
        List<School> schools = SchoolFactory.createSchools();
        for(School school : schools){
            map.put(school.getName(), school);
        }
        return map;
    }

    private static void pracPut() {
        List<School> schools = SchoolFactory.createSchools();
        _HashMap<String, School> map = new _HashMap<>();

        map.put("서울대", schools.getFirst());
        map.put("연세대", schools.get(1));
        map.put("grepp", schools.get(2));
        map.put("grepp", new School("우리반","집", 4));
        System.out.println(map.get("grepp"));
    }
}
