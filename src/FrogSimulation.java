public class FrogSimulation
{
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;
    private int dist = 0;
    private int passed = 0;
    private int failed = 0;
    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    /** Returns an integer representing the distance, in inches, to be moved when the frog hops.
     */
    private int hopDistance()
    {
        return (int)(Math.random() * 40 - 8);
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     * Returns true if the frog successfully reached or passed the goal during the simulation;
     * false otherwise.
     */
    public boolean simulate()
    {
        dist = 0;
        for (int i = 0; i < maxHops; i++){
            dist = dist + hopDistance();
            if(dist >= goalDistance) return true;
        }
        return false;
    }

    /** Runs num simulations and returns the proportion of simulations in which the frog
     * successfully reached or passed the goal.
     * Precondition: num > 0
     */
    public double runSimulations(int num)
    {
        passed = 0;
        failed = 0;
        for (int i = 0; i < num; i++){
            if (simulate()) {
                passed++;
            } else {
                failed++;
            }
        }
        return (double) passed / num;
    }
}
