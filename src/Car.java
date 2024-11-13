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
        if (increment > 0) {
            speed += increment;
            System.out.println("Автомобиль ускорился на " + increment + " км/ч.");
        } else {
            System.out.println("Значение ускорения должно быть положительным.");
        }
    }

    public void brake(int decrement) {
        if (decrement > 0) {
            speed -= decrement;
            System.out.println("Автомобиль замедлился на " + decrement + " км/ч.");
        } else {
            System.out.println("Значение замедления должно быть положительным.");
        }

    }

    public void printCarInfo() {
        System.out.println("Марка: " + getMake()
                + "\nМодель: " + getModel()
                + "\nГод выпуска: " + getYear()
                + "\nТекущая скорость: " + getSpeed());
        System.out.println("__________________________");
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
