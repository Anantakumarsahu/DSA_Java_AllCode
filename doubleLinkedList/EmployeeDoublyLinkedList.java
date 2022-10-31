package doubleLinkedList;

//This class is for LinkedList Inmplementation process

public class EmployeeDoublyLinkedList {

    private EmployeeNode head; //Head Node (pointing to 1st Node of the list)
    private EmployeeNode tail; //Tail Node (pointing to last Node of the list)
    private int size;

    
    //For Adding a Node to the front of the List............
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head==null) {
        	tail=node;
        }
        else {
        	head.setPrevious(node);
        }
        head = node;
        size++;
    }
    
    
    //For Adding a Node to the End of the List.............
    public void addToEnd(Employee employee) {
    	EmployeeNode node = new EmployeeNode(employee);
    	if(tail==null) {
    		head=node;
    	}
    	else {
    		tail.setNext(node);
    		node.setPrevious(tail);
    	}
    	tail=node;
    	size++;
    }
    

    //For Removing a Node from the front of the List..............
    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        if(head.getNext()==null) {
        	tail=null;
        }
        else {
        	head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    
    
    //For Removing a Node from the end of the List................
    public EmployeeNode removeFromEnd() {
    	if (isEmpty()) {
            return null;
        }
    	EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
    	return removedNode;
    }

    
    
    
    //For Getting the size of the List
    public int getSize() {
        return size;
    }

    //To check whether the List is Empty
    public boolean isEmpty() {
        return head == null;
    }

    //To Print the List
    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
