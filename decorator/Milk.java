package decorator;

class Milk extends CoffeeComponentDecorator {
	public Milk(CoffeeComponent coffee) {
		super(coffee);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding Milk");
	}
}
