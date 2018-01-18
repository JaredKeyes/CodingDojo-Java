class Vehicle {
    private int numberOfWheels;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String color) {
        this.color = color;
    }

    public Vehicle(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int number) {
        this.numberOfWheels = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}