package Baitap;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkHashSetExp1 {

	public static void main(String[] args) {
	//init set object
		Set<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("java");
		linkedHashSet.add("C++");
		linkedHashSet.add("Java");
		linkedHashSet.add("PHP");
		//show set
		for (String str : linkedHashSet) {
			System.out.println(str);
		}
	}

}
