public class Main {
    public static void main(String[] args) {

        Car electricalCar = new Car.CarBuilder(4,5).allowedPersons(7).engineType("Electrical").build();

        System.out.println(electricalCar);

        Car standardCar = new Car.CarBuilder(4,5).build();

        System.out.println(standardCar);
    }
}
