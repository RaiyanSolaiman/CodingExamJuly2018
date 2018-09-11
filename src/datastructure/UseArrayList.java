package datastructure;
import java.util.*;
public class UseArrayList
{

	public static void main(String[] args)
	{

			/* Creating ArrayList of type "String" which means
			 * we can only add "String" elements
			 */
			ArrayList<String> obj = new ArrayList<String>();

			/*This is how we add elements to an ArrayList*/
			obj.add("Ceasar");
			obj.add("Ptomley");
			obj.add("Cleopatra");
			obj.add("Henry");
			obj.add("Smeagul");
			obj.add("Rasputin");

			// Displaying elements
			System.out.println("Original ArrayList:");
			for(String str:obj)
				System.out.println(str);


			obj.add(0, "Ferdinand");
			obj.add(1, "Adolf");


			System.out.println("ArrayList after add operation:");
			for(String str:obj)
				System.out.println(str);

			//Remove elements from ArrayList like this
			obj.remove("Henry");
			obj.remove("Smeagul");

			// Displaying elements
			System.out.println("ArrayList after remove operation:");
			for(String str:obj)
				System.out.println(str);


			obj.remove(2);


			System.out.println("Final ArrayList:");
			for(String str:obj)
				System.out.println(str);
		}
	}
