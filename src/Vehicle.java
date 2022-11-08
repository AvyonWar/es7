public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails(){
        System.out.println(type + " " + numberOfWheels);
    }
    abstract void doVehicleSound();

}
