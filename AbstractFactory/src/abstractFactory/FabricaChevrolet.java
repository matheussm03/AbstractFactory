package abstractFactory;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Cruze();
	}

	@Override
	public CarroHatch criarCarroHatch() {
		return new Onix();
	}

}
