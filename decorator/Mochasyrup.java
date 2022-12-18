package decorator;

public class Mochasyrup extends CoffeeComponentDecorator {
	public Mochasyrup(CoffeeComponent coffee) {
		super(coffee);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding Mocha Syrup");
	}
}
