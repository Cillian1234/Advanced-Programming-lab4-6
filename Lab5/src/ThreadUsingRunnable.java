public class ThreadUsingRunnable implements Runnable {
    static String[] letters = {"1", "2", "3", "4"};
    static int threadCount = 0;

    @Override
    public void run() {
        Thread.currentThread().setName("Cillian " + threadCount++);
        for (String letter : letters) {
            System.out.printf("%S %S\n", Thread.currentThread().getName(), letter);
        }
        System.out.println("End of thread " + Thread.currentThread().getName());
    }
}
