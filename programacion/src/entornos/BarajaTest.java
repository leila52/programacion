package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarajaTest {

    Baraja baraja1, baraja2, baraja3;

    @BeforeEach
    void init(){
        //baraja de 40 cartas sin barajar
        baraja1 = new Baraja(1, false);

        //baraja de 80 cartas sin barajar
        baraja2 = new Baraja(2, false);

        // baraja de 40 cartas y barajarla
        baraja3 = new Baraja(1, true);
    }

    @Test
    void testNumeroCartas() {
        assertEquals(40, baraja1.numeroCartas());
        assertEquals(80, baraja2.numeroCartas());
        assertEquals(40, baraja3.numeroCartas());
    }

    @Test
    void testBarajar() {
        // solo podemos comprobar que el número de cartas sigue siendo el mismo
        assertEquals(40, baraja1.numeroCartas());
        assertEquals(80, baraja2.numeroCartas());
        assertEquals(40, baraja3.numeroCartas());
    }

    @Test
    void testCortar() {
        //  cortar la baraja en diferentes posiciones
        baraja1.cortar(10);
        assertEquals(30, baraja1.numeroCartas());

        baraja2.cortar(20);
        assertEquals(60, baraja2.numeroCartas());

        baraja3.cortar(5);
        assertEquals(35, baraja3.numeroCartas());
    }

    @Test
    void testRobar() {
        // robar carta
        baraja1.robar();
        assertEquals(39, baraja1.numeroCartas());

        baraja2.robar();
        assertEquals(79, baraja2.numeroCartas());

        baraja3.robar();
        assertEquals(39, baraja3.numeroCartas());
    }

    @Test
    void testVacia() {
        assertFalse(baraja1.vacia());
        assertFalse(baraja2.vacia());
        assertFalse(baraja3.vacia());

        //vaciamos todas las cartas
        while (!baraja1.vacia()) {
            baraja1.robar();
        }
        assertTrue(baraja1.vacia());

        while (!baraja2.vacia()) {
            baraja2.robar();
        }
        assertTrue(baraja2.vacia());

        while (!baraja3.vacia()) {
            baraja3.robar();
        }
        assertTrue(baraja3.vacia());
    }
}

