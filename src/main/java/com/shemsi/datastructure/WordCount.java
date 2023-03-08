package com.shemsi.datastructure;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Store the following lines as a list
        List<String> lines = Arrays.asList(
                "Nothing is so necessary for a young man as the company of intelligent women.",
                "The strongest of all warriors are these two — Time and Patience.",
                "If everyone fought for their own convictions there would be no war.",
                "There is no greatness where there is not simplicity, goodness, and truth.",
                "A limit has been set to human life, which cannot be overstepped",
                "Well, what makes you go to war?"
        );

        // Iterate through each line and split each sentence into words
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            String[] lineWords = line.split("\\W+");
            words.addAll(Arrays.asList(lineWords));
        }

        // Print the total number of words found
        System.out.println("Total number of words: " + words.size());

        // Generate the count for each word and store the count for each word as HashMap
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            int count = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, count + 1);
        }

        // Print all the words found alphabetically
        List<String> sortedWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sortedWords);
        System.out.println("Using forEach:");
        for (String word : sortedWords) {
            int count = wordCounts.get(word);
            System.out.println("Word: " + word + ", Count: " + count);
        }

        // Print the first and last word
        System.out.println("First word: " + words.get(0));
        System.out.println("Last word: " + words.get(words.size() - 1));

        // Print all the unique words ignoring case
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Unique words (ignoring case): " + uniqueWords);
    }
}
