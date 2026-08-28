public class MinhaThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread em execução!");
    }

    public static void main(String[] args) {
        MinhaThread minhaThread = new MinhaThread();
        minhaThread.start();
    }
}
