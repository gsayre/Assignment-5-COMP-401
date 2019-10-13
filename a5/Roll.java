package a5;

import java.util.ArrayList;
import java.util.List;

public class Roll implements Sushi{
	
	private String name;
	private IngredientPortion[] roll_ingredients;
	

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		this.name = name;
		this.roll_ingredients = roll_ingredients.clone();
		
		List<IngredientPortion> IngList = new ArrayList<IngredientPortion>();
		for (int i = 0; i < roll_ingredients.length; i++) {
			IngList.add(roll_ingredients[i]);

		}
		
		for (int i = 0; i < IngList.size(); i++) {
			IngredientPortion currentIng = this.roll_ingredients[i];
			for (int j = 0; j < IngList.size(); j++) {
				if (i != j) {
					if (currentIng.getIngredient().getName().equals(IngList.get(j).getName())) {
						IngList.set(i, roll_ingredients[i].combine(IngList.get(j)));
						
						IngList.remove(j);
					} 	
				}
			}
		}
		
	
		
		for (int i = 0; i < IngList.size(); i++) {
			if (IngList.get(i).getName().equals("seaweed")) {
				if (!(IngList.get(i).getAmount() >= 0.1)) {
					IngList.set(i, new SeaweedPortion(0.1));
					
				} 
				break;
			} else if (i == IngList.size() - 1) {
				IngList.add(new SeaweedPortion(0.1));
			}
		}

		IngredientPortion[] roll_ingredients2 = new IngredientPortion[IngList.size()];
		for (int i = 0; i < IngList.size(); i++) {
			roll_ingredients2[i] = IngList.get(i);
		}
		this.roll_ingredients = roll_ingredients2;
		
		
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return roll_ingredients.clone();
	}

	@Override
	public int getCalories() {
		double calories = 0;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			calories += roll_ingredients[i].getCalories();
		}
		return (int) (calories + 0.5);
	}

	@Override
	public double getCost() {
		double cost = 0;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			cost += roll_ingredients[i].getCost();
		}
		return  ((int) ((cost * 100.0) + 0.5)) / 100.0;
	}

	@Override
	public boolean getHasRice() {
		boolean hasRice = false;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsRice() == true) {
				hasRice = true;
				return hasRice;
			}
		}
		return hasRice;
	}

	@Override
	public boolean getHasShellfish() {
		boolean hasShellfish = false;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsShellfish() == true) {
				hasShellfish = true;
				return hasShellfish;
			}
		}
		return hasShellfish;
	}

	@Override
	public boolean getIsVegetarian() {
		boolean isVegetarian = true;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsVegetarian() == false) {
				isVegetarian = false;
				return isVegetarian;
			}
		}
		return isVegetarian;
	}
}
