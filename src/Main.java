public class Main {
    public static void main(String[] args) {
        FrogSimulation w = new FrogSimulation(-80, 10);
        System.out.println("Guaranteed Win Test: " + w.simulate());
        FrogSimulation L = new FrogSimulation(200, 2);
        System.out.println("Guaranteed Loss Test: " + L.simulate());
        FrogSimulation f = new FrogSimulation(58, 5);
        System.out.println("50/50 Test: " + f.simulate());
        System.out.println("should give around 0.5: " + f.runSimulations(1000));
    }
}
