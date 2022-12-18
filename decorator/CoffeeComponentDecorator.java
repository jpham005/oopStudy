package decorator;

abstract class CoffeeComponentDecorator implements CoffeeComponent {
	private CoffeeComponent _coffee;

	public CoffeeComponentDecorator(CoffeeComponent coffee) {
		_coffee = coffee;
	}
	
	@Override
	public void assemble() {
		_coffee.assemble();
	}
}
