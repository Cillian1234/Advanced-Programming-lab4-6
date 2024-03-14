public class TestThreadsPart1 {
    public static void main(String[] args) {
        ThreadUsingExtends[] threads = new ThreadUsingExtends[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ThreadUsingExtends("Cillian");
        }

        for (ThreadUsingExtends thread : threads) {
            thread.start();
        }
    }
}
