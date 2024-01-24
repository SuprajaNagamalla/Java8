package Runners;

import com.epam.java8.models.Employee;

public class TestThreads {
    public static void main(String arg[]) {


        Employee emp  = new Employee("Test", "savings", 20000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    //Thread.sleep(5000);
                    emp.setName("FirstThreadName");
                    System.out.println("first thread changes");
                    System.out.println(emp.getName());
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    emp.setName("NewTest");
                    System.out.println("change after t2 thread");
                   System.out.println(emp.getName());
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    //emp.setName("NewTest");
                    System.out.println("calling t3 thread");
                    System.out.println(emp.getName());
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
        t3.start();
        //main thread
        System.out.println("Main thread reading");
        System.out.println(emp.getName());

//        t1.join();
//        t2.join();

    }
}

