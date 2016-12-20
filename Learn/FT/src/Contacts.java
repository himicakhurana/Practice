import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class TrieNode {
    TrieNode[] arr;
    boolean isEnd;
    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }
 
}
 
 class Trie {
    private TrieNode root;
 
    public Trie() {
        root = new TrieNode();
    }
 
    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.isEnd=true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }
 
        return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
}
public class Contacts {
	static List<String> contactss = new ArrayList<>();
	static List<Integer> counts = new ArrayList<Integer>();

	public static void main(String[] args) {
		Trie t = new Trie();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();
			if (op.equals("add")) {
				/*
				 * contactss.add(contact);
				 */t.insert(contact);
			}
			if (op.equals("find")) {
				TrieNode p = t.searchNode(contact);
				if (p != null) {
					System.out.println(p.arr.length);

				}
			}
		}
	}
}
