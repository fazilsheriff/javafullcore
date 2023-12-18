package List;

import java.util.List;

public class ListCreateFunctions {
public static void main(String[] args) {
	List<String> words=List.of("Apple","Banana","citrus","dol");
	System.out.println(words);
	//When try to add list.of you get exception
	//java.lang.UnsupportedOperationException
	words.add("elegant");
	System.out.println(words);
	//FAZIL
}
}
