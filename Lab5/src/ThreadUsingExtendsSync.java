public class ThreadUsingExtendsSync extends Thread {
    static String[] letters = {"A", "B", "C", "D"};
    static int threadCount = 0;
    ThreadUsingExtendsSync(String threadName) {
        super(threadName +" "+threadCount++);
    }

    public void run() {
        synchronized (this) {
            for (String letter : letters) {
                System.out.printf("%S %S\n", getName(), letter);
            }
        }
        System.out.println("End of thread " + getName());
    }

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
