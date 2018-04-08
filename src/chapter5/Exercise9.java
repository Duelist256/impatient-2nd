package chapter5;

import java.util.Arrays;
import java.util.List;

public class Exercise9 {

    static class Car {
        private String manufacturer;
        private String name;
        private Integer year = -1;
        private String licensePlate = "";

        public Car(String manufacturer, String name) {
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public Car(String manufacturer, String name, Integer year) {
            this(manufacturer, name);
            this.year = year;
        }

        public Car(String manufacturer, String name, String licensePlate) {
            this(manufacturer, name);
            this.licensePlate = licensePlate;
        }

        public Car(String manufacturer, String name, Integer year, String licensePlate) {
            this(manufacturer, name);
            this.year = year;
            this.licensePlate = licensePlate;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getName() {
            return name;
        }

        public Integer getYear() {
            return year;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }
    }

    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model X");
        Car lexus = new Car("Lexus", "LS 400", 2017);
        Car porshe = new Car("Porshe", "911", 2015, "2342das");
        List<Car> cars = Arrays.asList(tesla, lexus, porshe);
        for (Car car : cars) {
            System.out.println(car.getManufacturer()
                    + " : " + car.getName()
                    + " : " + car.getYear()
                    + " : " + car.getLicensePlate());
        }
    }
}
