package entornos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Baraja
 */
public class Baraja {

    private ArrayList<Carta> lista_cartas;

    public Baraja() {
        this.lista_cartas = new ArrayList<Carta>();
        for (int i = 1; i < 41; i++) {
            lista_cartas.add(new Carta(i));
        }
    }

    public Baraja(int tipoBaraja) {
        this.lista_cartas = new ArrayList<Carta>();

        if (tipoBaraja == 1) {
            for (int i = 1; i < 41; i++) {
                lista_cartas.add(new Carta(i));
            }
        }

        if (tipoBaraja == 2) {
            for (int i = 1; i < 81; i++) {
                lista_cartas.add(new Carta(i));
            }
        }
    }

    public Baraja(int tipoBaraja, boolean barajar) {
        this.lista_cartas = new ArrayList<Carta>();

        if (tipoBaraja == 1) {
            for (int i = 1; i < 41; i++) {
                lista_cartas.add(new Carta(i));
            }
        }

        if (tipoBaraja == 2) {
            for (int i = 1; i < 81; i++) {
                lista_cartas.add(new Carta(i));
            }
        }

        if (barajar) {
            barajar();
        }
    }

    public void barajar() {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int corteAleatorio = random.nextInt(39) + 1;
            cortar(corteAleatorio);
        }

    }

    public void cortar(int posicion) {
        ArrayList <Carta> primeraMitad=new ArrayList<Carta>();
        ArrayList <Carta> segundaMitad=new ArrayList<Carta>();

        for (int i = 0; i < posicion; i++) {
            primeraMitad.add(lista_cartas.get(i));
        }

        for (int i = posicion; i < lista_cartas.size(); i++) {
            segundaMitad.add(lista_cartas.get(i));
        }

        lista_cartas.clear();
        lista_cartas.addAll(segundaMitad);
        lista_cartas.addAll(primeraMitad);
    }

    public Carta robar() {
        return lista_cartas.remove(0);
        // este metodo elimina y devuelve el elemento eliminado.
    }

    public void InsertaCartaPrincipio(Carta c) {
        lista_cartas.add(lista_cartas.size(), new Carta(c.getNumero(), c.getPalo()));
    }

    public void InsertaPrincipio(int id_carta) {
        Carta carta = new Carta(id_carta);
        lista_cartas.add(lista_cartas.size(), carta);
    }

    public void InsertaCartaFinal(int id_carta) {
        Carta carta = new Carta(id_carta);
        lista_cartas.add(carta);
    }

    public void InsertaCartaFinal(Carta c) {
        lista_cartas.add(new Carta(c.getNumero(), c.getPalo()));
    }

    public int numeroCartas() {
        return lista_cartas.size();
    }

    public boolean vacia() {
        if (lista_cartas.size() == 0) {
            return true;
        }
        return false;
    }

    public void mostrarBaraja(){
        for (Carta carta : lista_cartas) {
            System.out.println(carta.nombreCarta());
        }
    }
}
