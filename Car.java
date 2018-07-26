public class Car {
    private int wheelsAmount;
    private int doorsAmount;
    private int allowedPersons;
    private String steeringWheelPosition;
    private String engineType;

    public static class CarBuilder {

        private int wheelsAmount;
        private int doorsAmount;
        private int allowedPersons = 4;

        private String steeringWheelPosition = "Left";
        private String engineType = "Diesel";
        public CarBuilder(int wheelsAmount, int doorsAmount) {
            this.wheelsAmount = wheelsAmount;
            this.doorsAmount = doorsAmount;
        }

        public CarBuilder allowedPersons(int allowedPersons){
            this.allowedPersons = allowedPersons;
            return this;
        }

        public CarBuilder steeringWheelPosition(String steeringWheelPosition){
            this.steeringWheelPosition = steeringWheelPosition;
            return this;
        }

        public CarBuilder engineType(String engineType){
            this.engineType = engineType;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    private Car(CarBuilder carBuilder) {
        wheelsAmount = carBuilder.wheelsAmount;
        doorsAmount = carBuilder.doorsAmount;
        allowedPersons = carBuilder.allowedPersons;
        steeringWheelPosition = carBuilder.steeringWheelPosition;
        engineType = carBuilder.engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelsAmount=" + wheelsAmount +
                ", doorsAmount=" + doorsAmount +
                ", allowedPersons=" + allowedPersons +
                ", steeringWheelPosition='" + steeringWheelPosition + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
