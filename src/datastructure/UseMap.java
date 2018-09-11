package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class UseMap
{

	public static void main(String[] args)
	{
		    HashMap<Integer, String> hmap = new HashMap<Integer, String>();


			hmap.put(10, "Fedor");
			hmap.put(58, "Rutten");
			hmap.put(4, "Saekson");
			hmap.put(13, "Machado");
			hmap.put(8, "Mogamedsharipov");


			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
			while(iterator.hasNext())
			{
				Map.Entry mentry = (Map.Entry)iterator.next();
				System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
				System.out.println(mentry.getValue());
			}


			String var= hmap.get(58);
			System.out.println("Value at index 58 is: "+var);


			hmap.remove(10);
			System.out.println("Map key and values after removal:");
			Set set2 = hmap.entrySet();
			Iterator iterator2 = set2.iterator();
			while(iterator2.hasNext())
			{
				Map.Entry mentry2 = (Map.Entry)iterator2.next();
				System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
				System.out.println(mentry2.getValue());
			}


	}
}
