package List;


import java.util.LinkedList;
import java.util.List;


public class ListCreateFunctions {
public static void main(String[] args) {
	List<String> words=List.of("Apple","Banana");
	System.out.println("Lists"+words);
// Linked LISTS

	List<String> ll_words=new LinkedList<String>(words);
	System.out.println("List is converted in LinkedList"+ll_words);
//	List<String> vector_words=new Vector<String>(words);
//	System.out.println("List is converted in Vector"+vector_words);

// Add new items to the list 
	ll_words.add("Cake");
	ll_words.add("Donut");
	System.out.println("List is converted in Linked List"+ll_words);
	//Allows duplications for n number of times
	ll_words.add("Cake");
	System.out.println("List Allows duplication"+ll_words);
	
	//Removing item 
	ll_words.remove("Cake");
	System.out.println("Removing an item"+ll_words);
	
	//Adding an element in specific location
	ll_words.add(2, "Cake");
	System.out.println("Adding an element in specific location"+ll_words);


	// Removing an item in list by id
	ll_words.remove(2);
	System.out.println("Removing an element in specific location"+ll_words);
	
	//Removing by string
	ll_words.remove("Cake");
	System.out.println("Removing an element by string"+ll_words);
	
	//Removing all elements in lists
	ll_words.removeAll(words);
	System.out.println("Removing an element by string"+ll_words);



	
}
}
