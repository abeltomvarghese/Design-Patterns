package Singleton;

import java.util.List;

public class ScrabbleTest {

    public static void main(String[] args) {
        SingletonDesignPattern firstInstance = SingletonDesignPattern.getInstance();

        System.out.println("First Instance ID: " + System.identityHashCode(firstInstance));
        System.out.println(firstInstance.getLetterList());

        List<String> pOneTiles = firstInstance.getTiles(7);
        System.out.println("First Players Tiles: " + pOneTiles);

        System.out.println(firstInstance.getLetterList());

        SingletonDesignPattern secondInstance = SingletonDesignPattern.getInstance();

        System.out.println("Second Instance ID: " + System.identityHashCode(secondInstance));
        System.out.println(secondInstance.getLetterList());

        List<String> pTwoTiles = secondInstance.getTiles(7);
        System.out.println("Second Players Tiles: " + pTwoTiles);

        System.out.println(secondInstance.getLetterList());

    }
}
