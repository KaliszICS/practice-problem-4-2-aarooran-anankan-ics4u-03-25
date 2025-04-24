/** 
    * Gives the name, breed, and weight of the dog
    * @author Aarooran
    * @version 1.0
    */
class Dog {

    private String name;
    private String breed;
    private int weight;

    /**
     * Sets the parameter values to that of the instance varaibles
     * @param name the dog's name
     * @param breed the dog's breed
     * @param weight the dog's weight
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets the dog's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the dog's breed
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Gets the dog's weight
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Sets a new value for dog's name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Sets a new value for dog's breed
     */
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    /**
     * Sets a new value for dog's weight
     */
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
}