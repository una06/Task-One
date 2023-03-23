public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Camry", "Toyota", 2022, 25000.00, "blue", 5);

        System.out.println("Initial state of the car: " + myCar.toString());

        myCar.sell(2);

        System.out.println("After selling 2 cars: ");
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setModel("Corolla");
        myCar.setPrice(22000.00);

        System.out.println("After updating the model and price: " + myCar.toString());
    }
}