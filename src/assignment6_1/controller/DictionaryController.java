package assignment6_1.controller;

import assignment6_1.model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary = new Dictionary();

    public DictionaryController() {
        dictionary.addWord("apple", "A type of fruit.");
        dictionary.addWord("dog", "A common pet animal.");
        dictionary.addWord("book", "A collection of written pages.");
        dictionary.addWord("car", "A vehicle used for transportation.");
        dictionary.addWord("java", "A programming language.");
    }

    public String search(String word) {

        word = word.trim().toLowerCase();

        if (word.isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.searchWord(word);

        if (meaning == null) {
            return "Word not found.";
        }

        return meaning;
    }
}