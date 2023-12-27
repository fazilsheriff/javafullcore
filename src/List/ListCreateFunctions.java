package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCreateFunctions {
public static void main(String[] args) {
	List<String> words=List.of("Apple","Banana");
	System.out.println("Lists"+words);

	
	//Creating new ArrayLists,Linked Lists and Vector
	List<String> al_words=new ArrayList<String>(words);
//	List<String> ll_words=new LinkedList<String>(words);
//	System.out.println("List is converted in LinkedList"+ll_words);
//	List<String> vector_words=new Vector<String>(words);
//	System.out.println("List is converted in Vector"+vector_words);

// Add new items to the list 
	al_words.add("Cake");
	al_words.add("Donut");
	System.out.println("List is converted in ArrayList"+al_words);
	//Allows duplications for n number of times
	al_words.add("Cake");
	System.out.println("List Allows duplication"+al_words);
	
	//Removing item 
	al_words.remove("Cake");
	System.out.println("Removing an item"+al_words);
	
	//Adding an element in specific location
	al_words.add(2, "Cake");
	System.out.println("Adding an element in specific location"+al_words);


	// Removing an item in list by id
	al_words.remove(2);
	System.out.println("Removing an element in specific location"+al_words);
	
	//Removing by string
	al_words.remove("Cake");
	System.out.println("Removing an element by string"+al_words);
	
	//Removing all elements in lists
	al_words.removeAll(words);
	System.out.println("Removing an element by string"+al_words);



	
}
}
