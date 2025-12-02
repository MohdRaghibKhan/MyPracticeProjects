package abstraction;
public class CoffeeMaker {
    private int waterLevel;
    private int coffeeBeans;
    
    public CoffeeMaker() {
        waterLevel = 0;
        coffeeBeans = 0;
    }
    
    public void makeCoffee() {
        if (checkIngredients()) {
            brewCoffee();
            serveCoffee();
        } else {
            System.out.println("Not enough ingredients.");
        }
    }
    
    public void addIngredients(int water, int beans) {
        waterLevel += water;
        coffeeBeans += beans;
    }
    
    private boolean checkIngredients() {
        return waterLevel > 0 && coffeeBeans > 0;
    }
    
    private void brewCoffee() {
        // Simulate brewing process
        System.out.println("Brewing coffee...");
    }
    
    private void serveCoffee() {
        // Simulate serving process
        System.out.println("Serving coffee...");
    }
}
