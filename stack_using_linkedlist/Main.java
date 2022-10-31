package stack_using_linkedlist;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        System.out.println("\nAfter Pushing all the elements, the stack is:- \n");
        stack.printStack();

        System.out.println("\nThe Peak of the stack is:- \n");
        System.out.println(stack.peek());

        System.out.println("\n--------Performing Popped Operation----\n");
        System.out.println("Popped: " + stack.pop());
        System.out.println("\nAfter Popping an element, Now the stack is:- \n");
        stack.printStack();;



    }
}
