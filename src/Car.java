public class Car  extends  Vehicle{
    @Override
    void doVehicleSound() {
        System.out.println("Brummm");
    }
    public  int numberOfDoors;
    public  double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("veicolo A : number Of Doors - " + numberOfDoors);
    }
    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        super("Car", numberOfWheels);
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }


}
