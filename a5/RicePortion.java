package a5;

public class RicePortion extends IngredientPortionImpl 
{
private double amount;
	
	public RicePortion(double amount) {
		super(new Rice(), amount);
		
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
			return new RicePortion(this.getAmount() + other.getAmount());
		}
		if (!other.getIngredient().equals(this.getIngredient())) {
			throw new RuntimeException("Not the same Ingredient!");
		}
		return null;
	}

}
