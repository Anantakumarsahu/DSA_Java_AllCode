package jdk_linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        
        LinkedList<Employee> list = new LinkedList<>();
        
        //To add items in the front of the list........
        list.addFirst(mikeWilson);
        list.addFirst(marySmith);
        list.addFirst(johnDoe);
        list.addFirst(janeJones);
        //To Print the List.....................
        System.out.println("List Size -> " + list.size());
        System.out.print("HEAD->");
        for (Employee employee : list) {
        	System.out.print(employee);
        	System.out.print("->");
		}
        System.out.print("Null\n");
        
        
        //To add Items in the End of the List.................
        Employee bobend = new Employee("Bob","End",520);
        list.addLast(bobend);
        //To Print the List.....................
        System.out.println("List Size -> " + list.size());
        System.out.print("HEAD->");
        for (Employee employee : list) {
        	System.out.print(employee);
        	System.out.print("->");
		}
        System.out.print("Null\n");
        
        
        //To remove Items from the Front of the List................
        list.removeFirst();
        //To Print the List.....................
        System.out.println("List Size -> " + list.size());
        System.out.print("HEAD->");
        for (Employee employee : list) {
        	System.out.print(employee);
        	System.out.print("->");
		}
        System.out.print("Null\n");
        
        
      //To remove Items from the End of the List................
        list.removeLast();
        //To Print the List.....................
        System.out.println("List Size -> " + list.size());
        System.out.print("HEAD->");
        for (Employee employee : list) {
        	System.out.print(employee);
        	System.out.print("->");
		}
        System.out.print("Null\n");
        
    }
}