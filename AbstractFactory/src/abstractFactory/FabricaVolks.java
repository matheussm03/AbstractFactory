package abstractFactory;

public class FabricaVolks implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Voyage();
	}

	@Override
	public CarroHatch criarCarroHatch() {
		return new Gol();
	}

}
