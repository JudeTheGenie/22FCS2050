/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 02 - Sandwich
 */

/*
A sandwich is defined by a name, number of calories (integer is fine), and price. Users should be able to create a sandwich given its name, number of calories, and price. If informed number of calories or price is negative, make sure those values are initialized to zero. Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250, false otherwise.
 */
public class Sandwich {

    private String name;
    private int calories;
    private double price;
    private static final int HEALTHY_CALORIES = 250;

    public Sandwich(String name, int calories, double price) {
        this.name = name;
        if (calories < 0)
            this.calories = 0;
        else
            this.calories = calories;
        if (price < 0)
            this.price = 0;
        else
            this.price = price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

    public boolean isHealthy() {
        return calories < HEALTHY_CALORIES;
    }
}