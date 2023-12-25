package List;

import java.util.List;

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
}
}
