package com.shemsi.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

            public static void main(String[] args) {

                // create a list
                List<String> names = new ArrayList<>();

                // add items to the list
                names.add("John");
                names.add("Mary");
                names.add("Sara");

                System.out.println("Names : " + names);

                // get the size of a list
                System.out.println("Number of Names : " + names.size());

                // get an item from the list based on an index
                System.out.println("Element At Index 1 : " + names.get(1));

                // remove an item from the list based on an index
                System.out.println("Removed Element At Index 1: " + names.remove(1));

                // remove an item from the list based on a value
                System.out.println("Removed Sara: " + names.remove("Sara"));

                System.out.println("Remaining Names : " + names);

                // get the size of a list
                System.out.println("Number of Remaining Names : " + names.size());

                // iterate over a list
                for(String name :names) {
                    System.out.println("Name : " + name);
                }

                names.add(1, "Eric");

                if(names.contains("Eric")) {
                    System.out.println("Found Eric");
                }
            }
        }

