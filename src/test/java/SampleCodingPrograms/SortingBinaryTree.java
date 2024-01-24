package SampleCodingPrograms;

import com.epam.java8.models.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingBinaryTree {
    public  static void main(String args[]){
        String[] binary = {"1","0","1","0","0","1","0"};
        System.out.println(sortBinaryArray(binary));
        int i=0;
        int j=i;
        j=i++ + j;
        int t=10;
        long l=0B1010;

        System.out.println(t==l);

        System.out.println("i and j values"+i+ " "+j);
        System.out.println("test i value::"+test());

       // new Demo(); throws Stackoverflow exception due to recursive call of constructor

        String data = "Nationalization";
        //Question: Need to print the alphabets and the number of occurrences which are greater than 1 and also vowels.
        //Character count
        Map<Character, Long> inputChars = data.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(data+" inputChars::"+inputChars);
        String regex ="[aeiouAEIOU]";
        Map<Character, Long> finalResult = inputChars.entrySet().stream().filter(entry->entry.getKey().toString().matches(regex))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(data+" char count::"+finalResult);

        Map<Character,Integer> charCount = new HashMap<>();
        int size = data.length();
        char[] charArray = data.toCharArray();

        for(int c=0;c<size;c++){
            if(charCount.containsKey(charArray[c])){
                charCount.put(charArray[c],charCount.get(charArray[c])+1);
            }else{
                charCount.put(charArray[c],1);
            }

        }
        System.out.println("char count using for loop::"+charCount);

        Map<String, String> testHashmap = new HashMap<>();
        Map<String, String> testIdentity = new IdentityHashMap<>();
        testHashmap.put(new String("a"), "a");
        testHashmap.put(new String("a"), "a");

        testIdentity.put(new String("a"), "a");
        testIdentity.put(new String("a"), "a");


        System.out.println("testHashmap::"+testHashmap);
        System.out.println("testIdentity::"+testIdentity);

        List<Employee> employeeList = new ArrayList<>();
        //There is an employee class, which has 3 arguments (name, account, salary) as per below. Sort according to the salary and print the names, account and salary.
        Employee employee = new Employee("Gupta","123DEF",20000);
        Employee employee1 = new Employee("Hanuman","342ABC",10000);
        Employee employee2 = new Employee("Bavirisetti","ABD234",30000);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);


        List<Employee> employeeListSortedBySalary = employeeList.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
        System.out.println("employeeListSortedBySalary::"+employeeListSortedBySalary);
//        for (Employee e:employeeListSortedBySalary) {
//            System.out.println(e);
//        }
    }
    static List<Integer> sortBinaryArray(String[] input){
       // char[] charArray= input.length;
        int arraySize = input.length;
        System.out.println("arraySize::"+arraySize);
        int sum=0;
        List<Integer> sortedArray = new ArrayList<Integer>();
        for(int i=0;i<arraySize;i++){
            if(input[i].equals("1")){
                sortedArray.add(1);
            }else{
                continue;
            }
        }
        System.out.println("count::"+sum);
        for(int j=arraySize;j>=sortedArray.size();j--){
            sortedArray.add(0);
        }
//        for(int k=sum;k<charArray.length;k++){
//            sortedArray.add(0);
//        }
        return sortedArray;
    }
//    public Integer interview(){
//        return 0;
//    }
//    public String interview(){
//        return "";
//    }

    private static int test() {
        int i = 0;
        try {
            i++;
            throw new NullPointerException();
        } catch (NullPointerException ex) {
            return i++;
        } finally {
            return ++i;
        }
    }


}

class Demo{
    private Demo demo = new Demo();
}