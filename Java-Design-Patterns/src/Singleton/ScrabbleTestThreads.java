package Singleton;

public class ScrabbleTestThreads {

    public static void main(String[] args) {
        Runnable firstThread = new GetTheTiles();
        Runnable secondThread = new GetTheTiles();

        new Thread(firstThread).start();
        new Thread(secondThread).start();
    }
}
