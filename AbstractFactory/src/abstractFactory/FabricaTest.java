package abstractFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FabricaTest {

	@Test
	void deveRetornarOnixHatchChevrolet() {
		FabricaDeCarro fabrica = new FabricaChevrolet();
		CarroHatch hatch = fabrica.criarCarroHatch();

		assertEquals("Modelo: Onix\nCategoria: Hatch\nFabrica: Chevrolet", hatch.mostrarInfoHatch());
	}

	@Test
	void deveRetornarCruzeSedanChevrolet() {
		FabricaDeCarro fabrica = new FabricaChevrolet();
		CarroSedan sedan = fabrica.criarCarroSedan();

		assertEquals("Modelo: Cruze\nCategoria: Sedan\nFabrica: Chevrolet", sedan.mostrarInfoSedan());
	}

	@Test
	void deveRetornartGolHatchVolkswagen() {
		FabricaDeCarro fabrica = new FabricaVolks();
		CarroHatch hatch = fabrica.criarCarroHatch();

		assertEquals("Modelo: Gol\nCategoria: Hatch\nFabrica: Volkswagen", hatch.mostrarInfoHatch());
	}

	@Test
	void deveRetornartVoyageSedanVolkswagen() {
		FabricaDeCarro fabrica = new FabricaVolks();
		CarroSedan sedan = fabrica.criarCarroSedan();

		assertEquals("Modelo: Voyage\nCategoria: Sedan\nFabrica: Volkswagen", sedan.mostrarInfoSedan());
	}

}
