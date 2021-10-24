// Java program to remove elements
// in a LinkedList
	
import java.util.*;
// Heelo Commnet	
public class GFG {
	
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	
		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");
		
		
		
	    ll.add("GEEKS");
		ll.add("ONES");
		ll.add(1, "FOR");

	
		System.out.println(
			"Initial LinkedList " + ll);
	
		ll.remove(1);
	
		System.out.println(
			"After the Index Removal " + ll);
	
		ll.remove("Geeks");
	
		System.out.println(
			"After the Object Removal " + ll);
		ll.add("GEEKS");
		ll.add("ONES");
		ll.add(1, "FOR");

	}
}
