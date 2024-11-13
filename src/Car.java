public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (!make.isEmpty()) {
            this.make = make;
        } else {
            System.out.println("Марка не может быть пустой.");
            System.out.println();

        }
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
        if (year >= 2000) {
            this.year = year;
        } else {
            System.out.println("Некорректный год выпуска.");
            System.out.println();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("Автомобиль ускорился на " + increment + " км/ч.");
            System.out.println();

        } else {
            System.out.println("Значение ускорения должно быть положительным.");
            System.out.println();

        }
    }

    public void brake(int decrement) {
        if (decrement > 0) {
            speed -= decrement;
            System.out.println("Автомобиль замедлился на " + decrement + " км/ч.");
            System.out.println();

        } else {
            System.out.println("Значение замедления должно быть положительным.");
            System.out.println();

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
