package SampleCodingPrograms;

import com.epam.java8.models.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestSampleCodes {
    public static void main(String[] args) {
        System.out.println(test());
        String input = "Nationalization";
        Map<Character, Long> inputCharArray = input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("character count::"+inputCharArray);

        String regex = "[aeiouAEIOU]";
        Map<Character, Long> finalMap = inputCharArray.entrySet().stream().filter(entry->entry.getKey().toString().matches(regex)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("character count::"+finalMap);

        System.out.println("Print array in reverse without using temp array");
        int[] array = {10,20,30,40,50};
        int start=0, end = array.length-1;
        while(start<end){
            int temp=array[start];
            array[start] = array[end];
            array[end] = temp;
            start = start+1;
            end--;
        }
        for(int i: array){
            System.out.print(i);
        }
        System.out.println();
//        A piece of code to produce the Output from Input String.
                String inputString = "I am Hanuman Gupta, currently attending, interview with, EPAM systems";
//        String output= "Gupta Hanuman am I, attending currently, with interview, systems EPAM";

        String output="";
        String[] inputArray = inputString.split(",");
        for(int i=0;i<inputArray.length;i++){
            String commaSeperated = inputArray[i];
            String[] spaceSeperated = commaSeperated.split(" ");
            int length = spaceSeperated.length;
            for(int j=length-1;j>=0;j--){
                output += " "+spaceSeperated[j] ;
            }
            output +=",";
        }
        System.out.println("output::"+output);

        //Sort employee object by salary
        Employee e1 = new Employee("test1", "DBS", 130000.00);
        Employee e2 = new Employee("test2", "HSBC", 30000.50);
        Employee e3 = new Employee("test3", "Canara", 150000.50);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        List< Employee > employeesSortedList1 = employeeArrayList.stream()
                .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);
        System.out.println("---------After Sort of Employee salary reverse");
        ArrayList<Employee> sortedEmployees = (ArrayList<Employee>) employeeArrayList.stream().
                sorted((emp1,emp2)-> (int)(emp2.getSalary()-emp1.getSalary())).collect(Collectors.toList());
        for(Employee e: sortedEmployees){
            System.out.println(e);
        }

        List< Employee > employeesSortedListUsingComparator = employeeArrayList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("----------After Sort of Employee salary using Comparator");
        for(Employee e: employeesSortedListUsingComparator){
            System.out.println(e);
        }

        List< Employee > employeesSortedListUsingReverseComparator = employeeArrayList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("----------After Sort of Employee salary reverse using Comparator");
        for(Employee e: employeesSortedListUsingReverseComparator){
            System.out.println(e);
        }
    }
    Integer interview (){
        return 0;
    }
//    String interview (){
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
