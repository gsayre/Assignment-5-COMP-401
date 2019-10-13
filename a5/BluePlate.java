package a5;

public class BluePlate extends PlateImpl {

	public BluePlate(Sushi contents) throws PlatePriceException {
		super(contents, 4.0, Plate.Color.BLUE);
	}
}
