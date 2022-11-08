public class Boat extends Vehicle{
    public  double maxKnotsSpeed;
    public int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", boatKilosWeight);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    void doVehicleSound() {
        System.out.println("Bru - brummmmm");
    }
    public String getBoatWeightAndSpeed(){
        return "Boat: max knots speed " + maxKnotsSpeed + " - boat kilos weight " + boatKilosWeight;
    }
}
