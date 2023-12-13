import java.util.LinkedList;
public class linkedlist {
	

	
	    public static void main(String[] args) {
	        
	        LinkedList<String> linkedList = new LinkedList<>();

	 
	        linkedList.add("100");
	        linkedList.add("Prathyu");
	        linkedList.add("0.0");
	        linkedList.add("null");
	        System.out.println("Original List: " + linkedList);
	        linkedList.add("Strawberry");
	        System.out.println("LinkedList after adding: " + linkedList);
	        linkedList.add(2, "Pineapple");
	        System.out.println("LinkedList after adding: " + linkedList);
            linkedList.remove("Banana");
	        System.out.println("LinkedList after removing: " + linkedList);
	        linkedList.remove(3);
	        System.out.println("LinkedList after removing: " + linkedList);
	    }
	}



