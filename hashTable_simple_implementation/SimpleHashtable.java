package hashTable_simple_implementation;

public class SimpleHashtable {

	private Employee[] hashtable;
	
	public SimpleHashtable() {
		hashtable = new Employee[10];
	}
	
	//This HashFunction Converts all type of key to int type of key
	private int hashFunction(String key) {
		return (key.length() % hashtable.length);
	}
	
	public void put(String key, Employee employee) {
		int hashedkey = hashFunction(key);
		if(hashtable[hashedkey] != null)
			System.out.println("There's already an employee in position "+ hashedkey);
		else
			hashtable[hashedkey] = employee;
	}
	
	
	public Employee get(String key) {
		int hashedkey = hashFunction(key);
		return hashtable[hashedkey];
	}
	
	public void printHashtable() {
		for(int i=0; i<hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}

}
