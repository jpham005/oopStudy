package decorator;

public class Bean implements CoffeeComponent {
	private String _name;

	public Bean(String name) {
		_name = name;
	}

  @Override
	public void assemble() {
		System.out.print(_name);
	}
}
