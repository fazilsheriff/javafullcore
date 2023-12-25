package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCreateFunctions {
public static void main(String[] args) {
	List<String> words=List.of("Apple","Banana");
	System.out.println(words);
	//now wroking on functions of lists 
	//Length-size
	System.out.println("Lenth is "+words.size());
	//check is list is empty or not 
	System.out.println("List  isEmmpty "+words.isEmpty());
	//contains
	System.out.println("is list contains Apple?"+words.contains("Apple"));
	//index
	System.out.println("index of "+words.get(0));
//	//IF index is not found
//	System.out.println("If index is not found "+words.get(8));
	
	//Creating new ArrayLists,Linked Lists and Vector
	List<String> al_words=new ArrayList<String>(words);
	System.out.println("List is converted in ArrayList"+al_words);
	List<String> ll_words=new LinkedList<String>(words);
	System.out.println("List is converted in LinkedList"+ll_words);
	List<String> vector_words=new Vector<String>(words);
	System.out.println("List is converted in Vector"+vector_words);



	
}
}
