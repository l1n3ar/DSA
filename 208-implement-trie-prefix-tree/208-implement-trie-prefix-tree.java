class Trie {
        
    TrieNode root;
    
    
    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode current = this.root;
        int index;
        
        for(int i = 0;i<word.length();i++){
            index = word.charAt(i) - 'a';
            if(current.children[index] == null) current.children[index] = new TrieNode();
            current = current.children[index];
        }
        
        current.isEnd = true;
    }
    
    public boolean search(String word) {
        
        TrieNode current = this.root;
        int index;
        
        for(int i = 0;i<word.length();i++){
            index = word.charAt(i) - 'a';
            if(current.children[index] == null) return false;
            current = current.children[index];
        }
        
        return current.isEnd;
        
    }
    
    public boolean startsWith(String prefix) {
        
        TrieNode current = root;
        int index;
        
        for(int i = 0;i<prefix.length();i++){
            index = prefix.charAt(i) - 'a';
            if(current.children[index] == null) return false;
            current = current.children[index];
        }
        
        return true;
    }
}


class TrieNode{
    
    boolean isEnd;
    TrieNode[] children;
    
    public TrieNode(){
        this.isEnd = false;
        this.children = new TrieNode[26];
        for(int i = 0;i<this.children.length;i++){
            children[i] = null;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */