package QuestionSolve;

class TrafficSignal implements Runnable {
    private String currentSignal = "RED";

    public synchronized void turnOnRedLight() {
        currentSignal = "RED";
        notifyAll(); // Notify waiting threads that the signal has changed
    }

    public synchronized void turnOnYellowLight() {
        currentSignal = "YELLOW";
        notifyAll();
    }

    public synchronized void turnOnGreenLight() {
        currentSignal = "GREEN";
        notifyAll();
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (currentSignal.equals("RED")) {
                    System.out.println("RED");
                    Thread.sleep(10000);
                    turnOnYellowLight();
                    wait();
                } else if (currentSignal.equals("YELLOW")) {
                    System.out.println("YELLOW");
                    Thread.sleep(3000);
                    turnOnGreenLight();
                    wait();
                } else if (currentSignal.equals("GREEN")) {
                    System.out.println("GREEN");
                    Thread.sleep(15000);
                    turnOnRedLight();
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();
        Thread trafficSignalThread = new Thread(trafficSignal);
        trafficSignalThread.start();
    }
}