package datastructure;

import java.util.*;

public class CollectionView
{

public static void main(String[] args)
    {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
    Map<String, String> map = new HashMap<>();
    map.put("1", "NYC");
    map.put("2", "LA");
    map.put("3", "Denver");
    map.put("4", "Boston");
    map.put("5", "San Jose");
    map.put("5", "Seattle");

    Set<String> setCode = map.keySet();
    Iterator<String> iterator = setCode.iterator();

    while (iterator.hasNext())
        {
        String code = iterator.next();
        String country = map.get(code);

        System.out.println(code + " => " + country);
        }

    }
}
