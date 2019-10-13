package a5;

public class EelPortion extends IngredientPortionImpl {
	
private double amount;
	
	public EelPortion(double amount) {
		super(new Eel(), amount);
		
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
			return new EelPortion(this.getAmount() + other.getAmount());
		}
		if (!other.getIngredient().equals(this.getIngredient())) {
			throw new RuntimeException("Not the same Ingredient!");
		}
		return null;
	}

}
