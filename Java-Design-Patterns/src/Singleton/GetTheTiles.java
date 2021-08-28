package Singleton;

import java.util.List;

public class GetTheTiles implements Runnable{

    @Override
    public void run() {
        SingletonDesignPattern firstInstance = SingletonDesignPattern.getInstance();

        System.out.println("First Instance ID: " + System.identityHashCode(firstInstance));
        System.out.println(firstInstance.getLetterList());

        List<String> pOneTiles = firstInstance.getTiles(7);
        System.out.println("First Players Tiles: " + pOneTiles);
    }
}
