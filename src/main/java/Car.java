    /**
     * Gives the make, model, year, and price of a car
     * @author Aarooran
     * @version 1.0
     */
class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Sets the parameters to that of the instance variables
     * @param make the car's make
     * @param model the car's model
     * @param year the car's year
     * @param price the car's price
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets the car's make
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Gets the car's model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Gets the car's year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Gets the car's price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets a new value for the car's make
     * @param newMake the new value that make will be set to
     */
    public void setMake(String newMake) {
        this.make = newMake;
    }

    /**
     * Sets a new value for the car's model
     * @param newModel the new value that model will be set to
     */
    public void setModel(String newModel) {
        this.model = newModel;
    } 

    /**
     * Sets a new value for the car's year
     * @param newYear the new value that year will be set to
     */
    public void setYear(int newYear) {
        this.year = newYear;
    }

    /**
     * Sets a new value for the car's price
     * @param newPrice the new value that price will be set to
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
