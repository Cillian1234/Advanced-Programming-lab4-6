public class TestThreadsPart2 {
    public static void main(String[] args) {
        int numOfThreads = 5;

        ThreadUsingRunnable[] threads = new ThreadUsingRunnable[numOfThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadUsingRunnable();
        }

        Thread[] actualThreads = new Thread[numOfThreads];
        for (int i = 0; i < actualThreads.length; i++) {
            actualThreads[i] = new Thread(threads[i]);
        }

        for (Thread actualThread : actualThreads) {
            actualThread.start();
        }
    }
}
