package com.dathanwong.tries;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        System.out.println(trie.isPrefixValid("ca"));//Should print true
        System.out.println(trie.isPrefixValid("t"));//True
        System.out.println(trie.isPrefixValid("cr"));//False
        System.out.println(trie.isWordValid("car"));//True
        System.out.println(trie.isWordValid("ca"));//False
        trie.printAllKeys();
    }
}
