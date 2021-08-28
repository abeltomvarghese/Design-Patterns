package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SingletonDesignPattern {
    private static SingletonDesignPattern firstInstance = null;
    private static boolean firstThread = true;
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
                                "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
                                "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
                                "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
                                "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
                                "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
                                "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
                                "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};
    private List<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    

    private SingletonDesignPattern() {}

    public static SingletonDesignPattern getInstance() {
        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;

                try {
                    Thread.currentThread();
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (SingletonDesignPattern.class){
            if (firstInstance == null) {
                firstInstance = new SingletonDesignPattern();

                Collections.shuffle(firstInstance.letterList);
            }
        }

        return firstInstance;
    }

    public List<String> getLetterList(){
        return firstInstance.letterList;
    }

    public List<String> getTiles(int numTiles){
        List<String> playerTiles = new LinkedList<String>();

        for (int i = 0; i < numTiles; i++){
            playerTiles.add(firstInstance.letterList.remove(0));
        }

        return playerTiles;
    }


}
