package abstractFactory;

public class Voyage implements CarroSedan {

	@Override
	public String mostrarInfoSedan() {
		return "Modelo: Voyage\nCategoria: Sedan\nFabrica: Volkswagen";
	}

}
