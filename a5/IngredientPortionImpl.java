package a5;

public abstract class IngredientPortionImpl implements IngredientPortion {

	private Ingredient ing;
	private double amount;
	
	public IngredientPortionImpl(Ingredient ing, double amount) {
		this.ing = ing;
		this.amount = amount;
	}
	
	public Ingredient getIngredient() {
		return ing;
	}
	public String getName() {
		return ing.getName();
	}
	public double getAmount() {
		return amount;
	}
	public double getCalories() {
		return ing.getCaloriesPerOunce() * amount;
	}
	public double getCost() {
		return ing.getPricePerOunce() * amount;
	}
	public boolean getIsVegetarian() {
		return ing.getIsVegetarian();
	}
	public boolean getIsRice() {
		return ing.getIsRice();
	}
	public boolean getIsShellfish() {
		return ing.getIsShellfish();
	}
	public abstract IngredientPortion combine(IngredientPortion other);
}
