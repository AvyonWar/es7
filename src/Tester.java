public class Tester {
    public  static void main(String[] args){
        Car car = new Car(4, 5,1000);
        Boat boat = new Boat(100, 20);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
