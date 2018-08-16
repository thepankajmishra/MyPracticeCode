package com.pankaj.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Practice {

  public static void main(String[] arg) {
    List<String> persons = new ArrayList<>();
    persons.add("Pankaj");
    persons.add("Nitin");
    persons.add("Shashi");
    persons.add("Abhi");
    persons.add("Nitesh");
    persons.add("Swati");
    persons.add("Alok");
    
    Comparator<String> byName = (s1, s2) -> (s1.compareTo(s2));
    System.out.println(persons);
    persons.sort(byName);
    System.out.println(persons);
    persons.sort(byName.reversed());
    persons.forEach(System.out::println);
    System.out.println("------------------------------------------------------");
    persons.stream().filter(s ->s.contains("a")).forEach(System.out::println);
    
    
    List<String> list = persons.stream().filter(s -> s.startsWith("A")).sorted(byName).collect(Collectors.toList());
    System.out.println("------------------------------------------------------");
    System.out.println(list);
    
    List<String> list1 = persons.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println("------------------------------------------------------");
    System.out.println(list1);
    
    Map<String,String> personsMap = new HashMap<>();
    personsMap.put("15","Pankaj");
    personsMap.put("101","Nitin");
    personsMap.put("17","Shashi");
    personsMap.put("91","Abhi");
    personsMap.put("12","Nitesh");
    personsMap.put("11","Swati");
    personsMap.put("31","Alok");
    
    personsMap.entrySet().stream().sorted(Map.Entry.comparingByKey(byName.reversed())).forEach((e) -> System.out.println("Key : "+e.getKey()+", value : "+e.getValue()));
     
     
    personsMap.forEach((String k, String v) -> System.out.println("Key = "+k+" , value = "+v));
    
    
  }
}
