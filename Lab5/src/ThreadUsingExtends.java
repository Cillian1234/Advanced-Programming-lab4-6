public class ThreadUsingExtends extends Thread {
    static String[] letters = {"A", "B", "C", "D"};
    static int threadCount = 0;
    ThreadUsingExtends(String threadName) {
        super(threadName +" "+threadCount++);
    }

    public void run() {
        for (String letter : letters) {
            System.out.printf("%S %S\n", getName(), letter);
        }
        System.out.println("End of thread " + getName());
    }
}
