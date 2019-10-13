package a5;

public class SalmonPortion extends IngredientPortionImpl {
	
private double amount;
	
	public SalmonPortion(double amount) {
		super(new Salmon(), amount);
		
		if (amount < 0) {
			throw new RuntimeException("Amount parameter is negative!");
		}
		this.amount = amount;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			return new SalmonPortion(this.getAmount() + other.getAmount());
		}
		if (!other.getIngredient().equals(this.getIngredient())) {
			throw new RuntimeException("Not the same Ingredient!");
		}
		return null;
	}

}
