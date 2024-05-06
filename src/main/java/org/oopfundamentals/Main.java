package org.oopfundamentals;


public class Main {
    public static void main(String[] args) {
        CarBrand toyota = new CarBrand("Toyota", "Japan");
        CarModel camry = new CarModel("Toyota", "Japan", "Camry", 2022);

        CarBrand bmw = new CarBrand("BMW", "Germany");
        CarModel x5 = new CarModel("BMW", "Germany", "X5", 2023);


        Car toyotaCamry = new Car(camry);
        Car bmwX5 = new Car(x5);

        toyotaCamry.start();
        toyotaCamry.stop();

        bmwX5.start();
        bmwX5.stop();
    }
}