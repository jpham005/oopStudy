package decorator;

public class Whippedcream extends CoffeeComponentDecorator {
	public Whippedcream(CoffeeComponent coffee) {
		super(coffee);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding Whipped Cream");
	}
}
