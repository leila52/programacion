package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Cartatest {
	Carta carta,carta1;
	Baraja baraja;
	@BeforeEach
	void init() {
		//sota de copas
		carta = new Carta(8,1);
		//as de oros
		carta1 = new Carta(1,0);
		baraja=new Baraja(1,true);
	}
	
	@Test
	void CARTAESIGUALASOTADECOPAS() {
		String cartu = carta.nombreCarta();
		 assertEquals(true,cartu.equals("sota de COPAS"));
	}
	@Test
	void CARTA2ESIGUALAASDEOROS() {
		String carti = carta1.nombreCarta();
		 assertEquals(true,carti.equals("as de OROS"));
	}
	@Test
	void sotadecopasenelsieteymediovaleceroconcinco() {
		 assertEquals(0.5,carta.valor7ymedia());
	}
	@Test
	void asdeorosesigualaunoenelsieteymedio() {
		 assertEquals(1,carta1.valor7ymedia());
	}
	
	@Test
	void sotaDeCaballosEsIgualADiezEnElMus() {
		 assertEquals(10,carta.valorMus());
	}
	
	@Test
	void AsDeOrosEsIgualAUnoEnElMus() {
		 assertEquals(1,carta1.valorMus());
	}
	
	@Test
	void sotaDeCaballosEsIgualADosEnElTute() {
		 assertEquals(2,carta.valorTute());
	}
	
	@Test
	void AsDeOrosEsIgualAOnceEnElTute() {
		 assertEquals(11,carta1.valorTute());
	}

}

