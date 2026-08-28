public class TresThreads {

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread A");
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread B");
            }
        });

        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread C");
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
