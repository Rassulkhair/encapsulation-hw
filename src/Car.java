public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
    }

    public void printCarInfo() {
        System.out.println("Make = " + getMake()
                + "\nModel = " + getModel()
                + "\nYear = " + getYear()
                + "\nSpeed = " + getSpeed());
        System.out.println("__________________________");
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
