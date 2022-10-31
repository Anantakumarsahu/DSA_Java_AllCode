package doubleLinkedList;

//This class is the main class

public class Main {

    public static void main(String[] args) {

    	
    	EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println("Currently the list is Empty? -> " + list.isEmpty());
        System.out.println();
        
        
        //List to add to the front
        System.out.println("Adding Nodes to the Front of the List");
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        System.out.println(list.getSize());
        list.printList();
        
        
        //List to add to the end
        System.out.println("\nAdding a Node to the End of the List");
        Employee billEnd = new Employee("Bill", "End", 520);
        list.addToEnd(billEnd);
        System.out.println(list.getSize());
        list.printList();
        
        
        //List to remove from front
        System.out.println("\nRemoving a Node from the front of the List");
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        
        
      //List to remove from End
        System.out.println("\nRemoving a Node from the End of the List");
        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();

        
    }
}
