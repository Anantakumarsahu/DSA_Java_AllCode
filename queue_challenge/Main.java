package queue_challenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    	
    	/*For Stack Palindrome Checking */
    	System.out.println("In The Stack Part................................");
        // should return true
        System.out.println(stackCheckForPalindrome("abccba"));
        // should return true
        System.out.println(stackCheckForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(stackCheckForPalindrome("I did, did I?"));
        // should return false
        System.out.println(stackCheckForPalindrome("hello"));
        // should return true
        System.out.println(stackCheckForPalindrome("Don't nod"));
        
        
        /*For Queue Palindrome Checking */
        System.out.println("\nIn The Queue Part................................");
        // should return true
        System.out.println(queueCheckForPalindrome("abccba"));
        // should return true
        System.out.println(queueCheckForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(queueCheckForPalindrome("I did, did I?"));
        // should return false
        System.out.println(queueCheckForPalindrome("hello"));
        // should return true
        System.out.println(queueCheckForPalindrome("Don't nod"));
    }
    
    
    
    public static boolean stackCheckForPalindrome(String string) {
    	LinkedList<Character> stack = new LinkedList<Character>();
    	String newStr = string.replaceAll("[ \\t\\n\\x0B\\f\\r?,'.;]", "");
    	String lowerChar = newStr.toLowerCase();
//		Remember Stack is Last in First Out Algorithm (LIFO)
		StringBuilder sb = new StringBuilder(lowerChar);
		for(int i=0; i<sb.length(); i++) {
			stack.push(sb.charAt(i));
		}
//		System.out.println(sb);
		StringBuilder reverseString = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
//		System.out.println(reverseString);
		if(lowerChar.equals(reverseString.toString()))
			return true;
		return false;
    }
    
    

    public static boolean queueCheckForPalindrome(String string) {
    	LinkedList<Character> queue = new LinkedList<Character>();
    	String newStr = string.replaceAll("[ \\t\\n\\x0B\\f\\r?,'.;]", "");
    	String lowerChar = newStr.toLowerCase();
    	
    	StringBuilder sb = new StringBuilder(lowerChar);
		for(int i=0; i<sb.length(); i++) {
			queue.addFirst(sb.charAt(i));
		}
//		System.out.println(sb);
//		Remember Queue is First in First Out Algorithm (FIFO)
		
		StringBuilder reverseString = new StringBuilder(queue.size());
		while(!queue.isEmpty()) {
			reverseString.append(queue.removeFirst() );
		}
//		System.out.println(reverseString);
		
    	if(lowerChar.equals(reverseString.toString()))
    		return true;
        return false;
    }
}
