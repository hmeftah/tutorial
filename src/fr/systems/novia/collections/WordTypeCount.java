package fr.systems.novia.collections;

/**
 * Created by formation2 on 22/05/15.
 */
// Fig. 16.18: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount
{
    public static void main(String[] args)
    {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    // create map from user input
    private static void createMap(Map<String, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split(" ");

        // processing input text
        for (String token : tokens)
        {
            String word = token.toLowerCase(); // get lowercase word

            // if the map contains the word
            if (map.containsKey(word)) // is word in map
            {
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            }
            else
                map.put(word, 1); // add new word with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
} // end class WordTypeCount

/*
Duplicate Objects
Main difference between List and Set interface in Java is that List allows duplicates while Set doesn't allow duplicates. All implementation of Set honor this contract.
Map  holds two object per Entry e.g. key and value and It may contain duplicate values but keys are always unique.

Order
Another key difference between List and Set is that List is an ordered collection,
List's contract maintains insertion order or element. Set is an unordered collection,
you get no guarantee on which order element will be stored.
Though some of the Set implementation e.g. LinkedHashSet maintains order.
Also SortedSet and SortedMap e.g. TreeSet and TreeMap maintains a sorting order, imposed by using Comparator or Comparable.

Null elements
List allows null elements and you can have many null objects in a List,
because it also allowed duplicates. Set just allow one null element as
there is no duplicate permitted while in Map you can have null values and at most one null key.
worth noting is that Hashtable doesn't allow null key or values but HashMap allows null values and one null keys.
This is also the main difference between these two popular implementation of Map interface, aka HashMap vs Hashtable
 */




