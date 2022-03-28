package web.model;

public class Car {

    private String name;

    private String model;

    private int price;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + model + " price: " + price;
    }
}