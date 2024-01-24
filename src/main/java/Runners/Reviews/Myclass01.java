//package Runners.Reviews;
//
//package com.epam.java.java8.training;
//
//import java.util.*;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//
//class Employee{
//    int empId;
//    String name;
//
//    public Employee(int empId, String name) {
//        this.empId = empId;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//
//public class MyClass01 {
//
//    public void pallindrome(String s1){
//        char[]arr=s1.toCharArray();
//        String s2="";
//        for(int i=s1.length()-1;i>=0;i--){
//            s2+=arr[i];
//        }
//        if(s1.equals(s2)) System.out.println("same");
//        else System.out.println("not same");
//    }
//    public void pallindromeLambda(String s1){
//        Function<String,String>fn=(s)->new StringBuilder(s).reverse().toString();
//        String newString=fn.apply(s1);
//
//        if(s1.equals(newString)) System.out.println("same");
//        else System.out.println("not same");
//    }
//    public void secondBiggestNumber(int []arr){
//
//        Arrays.sort(arr);
//        int temp=arr.length-2;
//        System.out.println(arr[temp]);
//        for(int c:arr){
//            System.out.print(c+" ");
//        }
//        System.out.println(arr[temp]);
//    }
//    public void secondBiggestNumberLambda(Integer []arr){
//        Arrays.sort(arr);
//        int temp=arr.length-2;
//        Function<Integer [],Integer>fn=(s)->s[temp];
//        int result=fn.apply(arr);
//        System.out.println(result);
//
//    }
//    public void checkRotation(String s1,String s2) {
//        char firstChar = s1.charAt(0);
//        int temp = 0;
//        boolean flag = true;
//        int size = s1.length();
//        for (int i = 0; i < s1.length(); i++) {
//            if (firstChar == s2.charAt(i)) temp = i;
//        }
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt((temp + i) % size)) {
//                flag = false;
//            }
//        }
//        if (flag) System.out.println("rotation");
//        else System.out.println("not rotation");
//    }
//    public void checkRotationLambda(String p1, String p2){
//        BiFunction<String,String,Boolean>bfn=(s1,s2)->{
//            char firstChar = s1.charAt(0);
//            int temp = 0;
//            boolean flag = true;
//            int size = s1.length();
//            for (int i = 0; i < s1.length(); i++) {
//                if (firstChar == s2.charAt(i)) temp = i;
//            }
//            for (int i = 0; i < s1.length(); i++) {
//                if (s1.charAt(i) != s2.charAt((temp + i) % size)) {
//                    flag = false;
//                }
//            }
//            return flag;
//        };
//        Boolean result=bfn.apply(p1,p2);
//        if(result) System.out.println("rotation");
//        else System.out.println("not rotation");
//
//    }
//    public void runnable(){
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("1");
//            }
//        });
//        thread.start();
//        System.out.println("main thread");
//    }
//    public void runnableLambda(){
//        Thread thread=new Thread(()-> System.out.println(1));
//        thread.start();
//        System.out.println("main thread");
//    }
//    public void reverseSortListComparator(Integer []arr){
//        List<Integer> l=Arrays.asList(arr);
//        Collections.sort(l, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        System.out.println(l);
//
//    }
//    public void reverseSortListComparatorLambda(Integer []arr){
//        List<Integer> l=Arrays.asList(arr);
//        Collections.sort(l, (o1,o2)->o2-o1);
//        System.out.println(l);
//
//    }
//    public void sortAlphabeticallyComparator(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        List<Employee>l=new ArrayList<>();
//        Collections.addAll(l,e1,e2,e3,e4);
//        Collections.sort(l, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        System.out.println(l);
//
//    }
//    public void sortAlphabeticallyComparatorLambda(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        List<Employee>l=new ArrayList<>();
//        Collections.addAll(l,e1,e2,e3,e4);
//        Collections.sort(l, (o1,o2)->o1.name.compareTo(o2.name));
//        System.out.println(l);
//
//    }
//    public void revserseSortTreeSet(){
//
//        Set<Integer>s=new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        Collections.addAll(s,32,12,22,91,22,58);
//        System.out.println(s);
//    }
//    public void revserseSortTreeSetLambda(){
//
//        Set<Integer>s=new TreeSet<>((o1,o2)->o2-o1);
//        Collections.addAll(s,32,12,22,91,22,58);
//        System.out.println(s);
//    }
//    public void sortTreeSetAlphabeticallyComparator(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        Set<Employee>s=new TreeSet<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        Collections.addAll(s,e1,e2,e3,e4);
//        System.out.println(s);
//    }
//    public void sortTreeSetAlphabeticallyComparatorLambda(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        Set<Employee>s=new TreeSet<>((o1,o2)->o1.name.compareTo(o2.name));
//        Collections.addAll(s,e1,e2,e3,e4);
//        System.out.println(s);
//    }
//    public void reverseSortTreeMap(){
//        Map<Integer,String>mp=new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        mp.put(34,"pan");
//        mp.put(26,"lio");
//        mp.put(47,"ary");
//        mp.put(19,"zem");
//        mp.put(88,"quw");
//        System.out.println(mp);
//    }
//    public void reverseSortTreeMapLambda(){
//        Map<Integer,String>mp=new TreeMap<>((o1,o2)->o2-o1);
//        mp.put(34,"pan");
//        mp.put(26,"lio");
//        mp.put(47,"ary");
//        mp.put(19,"zem");
//        mp.put(88,"quw");
//        System.out.println(mp);
//    }
//    public void sortTreeMapReverseComparator() {
//        Map<String, Integer> mp = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        mp.put("pan",34);
//        mp.put("lio",26);
//        mp.put("ary",47);
//        mp.put("zem",19);
//        mp.put("quw",88);
//        System.out.println(mp);
//    }
//    public void sortTreeMapReverseComparatorLambda() {
//        Map<String, Integer> mp = new TreeMap<>((o1,o2)->o2.compareTo(o1));
//        mp.put("pan",34);
//        mp.put("lio",26);
//        mp.put("ary",47);
//        mp.put("zem",19);
//        mp.put("quw",88);
//        System.out.println(mp);
//    }
//    public void sortListReverseComparator(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        List<Employee>l=new ArrayList<>();
//        Collections.addAll(l,e1,e2,e3,e4);
//        Collections.sort(l, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        });
//        System.out.println(l);
//    }
//    public void sortListReverseComparatorLambda(){
//        Employee e1 =new Employee(12,"zyan");
//        Employee e2 =new Employee(64,"orio");
//        Employee e3 =new Employee(5,"arya");
//        Employee e4 =new Employee(77,"fazz");
//        List<Employee>l=new ArrayList<>();
//        Collections.addAll(l,e1,e2,e3,e4);
//        Collections.sort(l, (o1,o2)->o2.name.compareTo(o1.name));
//        System.out.println(l);
//    }
//    public static void main(String[] args) {
////        String s1="ayush";
////        StringBuilder s2=new StringBuilder("pop");
////        StringBuilder sb=new StringBuilder("pop");
////
////         s2.reverse();
////        System.out.println(s2);
////        System.out.println(sb);
////        if(sb.equals(s2))
////            System.out.println("palindrome");
////        else
////            System.out.println("not Palindrome");
//
//        MyClass01 myClass01=new MyClass01();
//        //myClass01.pallindrome("level");
//        //myClass01.secondBiggestNumber(new int[]{23,7,94,72,36});
//        //myClass01.checkRotation("ayush","shayu");
//        //myClass01.runnable();
//        //myClass01.reverseSortListComparator(new Integer[]{101,23,154,71,505,238});
//        //myClass01.sortAlphabeticallyComparator();
//        //myClass01.revserseSortTreeSet();
//        //myClass01.sortTreeSetAlphabeticallyComparator();
//        //myClass01.reverseSortTreeMap();
//        //myClass01.sortTreeMapReverseComparator();
//        //myClass01.sortListReverseComparator();
//
//        //myClass01.pallindromeLambda("level");
//        //myClass01.secondBiggestNumberLambda(new Integer[]{23,7,94,72,36});
//        //myClass01.checkRotationLambda("ayush","shayu");
//        //myClass01.runnableLambda();
//        //myClass01.reverseSortListComparatorLambda(new Integer[]{101,23,154,71,505,238});
//        //myClass01.sortAlphabeticallyComparatorLambda();
//        //myClass01.revserseSortTreeSetLambda();
//        //myClass01.sortTreeSetAlphabeticallyComparatorLambda();
//        //myClass01.reverseSortTreeMapLambda();
//        //myClass01.sortTreeMapReverseComparatorLambda();
//        //myClass01.sortListReverseComparatorLambda();
//
//    }
//
//
//}
//
