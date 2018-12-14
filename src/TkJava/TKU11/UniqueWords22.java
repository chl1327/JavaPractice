package TkJava.TKU11;

import net.mindview.util.TextFile;

import java.util.*;

class Word {
    static int totalWords = 0;
    String s;
    int count;
    Word(String s, int count) {
        this.s = s;
        this.count = count;
        totalWords++;
    }
    @Override
    public String toString() { return s + ": " + count; }
}

public class UniqueWords22 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(
                new TextFile("SetOperations.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Words to count, sorted: " + words);
        Set<Word> wordObjects = new HashSet<Word>();
        Iterator it = words.iterator();
        while(it.hasNext()) {
            String s = (String)it.next();
            int count = 0;
            for(int i = 0; i < words.size(); i++) {
                if(s.equals(words.get(i))) count++;
            }
            Word w = new Word(s, count);
            wordObjects.add(w);
        }
        System.out.println("Word count: " + wordObjects);
        System.out.println("Total words: " + Word.totalWords);
    }
}
