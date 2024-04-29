package entornos;

public class Carta {
    static final int OROS=0;
    static final int COPAS=1;
    static final int ESPADAS=2;
    static final int BASTOS=3;



    private int numero;
    private int palo;

    public Carta(int numero, int palo){
        this.numero=numero;
        this.palo=palo;
    }

    public Carta(int id){
        if (id==10 || id==20 || id==30 || id==40) {
            this.numero=10;
        }else{
            this.numero=id%10;
        }

        if (id<=10) {
            this.palo=OROS;
        }else if (id<=20) {
            this.palo=COPAS;
        }else if (id<=30) {
            this.palo=ESPADAS;
        }else if (id<=40) {
            this.palo=BASTOS;
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }

    public String nombreNumero() {
        if (getNumero()==1) {
            return "as";
        }else if (getNumero()==2) {
            return "dos";
        }else if (getNumero()==3) {
            return "tres";
        }else if (getNumero()==4) {
            return "cuatro";
        }else if (getNumero()==5) {
            return "cinco";
        }else if (getNumero()==6) {
            return "seis";
        }else if (getNumero()==7) {
            return "siete";
        }else if (getNumero()==8) {
            return "sota";
        }else if (getNumero()==9) {
            return "caballo";
        }else if (getNumero()==10) {
            return "rey";
        }
        return "";
    }

    public String nombrePalo() {
        if (getPalo()==OROS) {
            return "OROS";
        }
        if (getPalo()==COPAS) {
            return "COPAS";
        }
        if (getPalo()==ESPADAS) {
            return "ESPADAS";
        }
        if (getPalo()==BASTOS) {
            return "BASTOS";
        }
        return "";
    }

    public String nombreCarta(){
        return nombreNumero()+ " de "+nombrePalo();
    }

    public int valorTute(){
        if (getNumero()==1) {
            return 11;
        }else if (getNumero()==2) {
            return 2;
        }else if (getNumero()==3) {
            return 10;
        }else if (getNumero()==4) {
            return 4;
        }else if (getNumero()==5) {
            return 5;
        }else if (getNumero()==6) {
            return 6;
        }else if (getNumero()==7) {
            return 7;
        }else if (getNumero()==8) {
            return 2;
        }else if (getNumero()==9) {
            return 3;
        }else if (getNumero()==10) {
            return 4;
        }
        return -1;
    }

    public int valorMus(){
        if (getNumero()==1) {
            return 1;
        }else if (getNumero()==2) {
            return 1;
        }else if (getNumero()==3) {
            return 10;
        }else if (getNumero()==4) {
            return 4;
        }else if (getNumero()==5) {
            return 5;
        }else if (getNumero()==6) {
            return 6;
        }else if (getNumero()==7) {
            return 7;
        }else if (getNumero()==8) {
            return 10;
        }else if (getNumero()==9) {
            return 10;
        }else if (getNumero()==10) {
            return 10;
        }
        return -1;
    }

    public double valor7ymedia(){
        if (getNumero()==1) {
            return 1;
        }else if (getNumero()==2) {
            return 2;
        }else if (getNumero()==3) {
            return 3;
        }else if (getNumero()==4) {
            return 4;
        }else if (getNumero()==5) {
            return 5;
        }else if (getNumero()==6) {
            return 6;
        }else if (getNumero()==7) {
            return 7;
        }else if (getNumero()==8) {
            return 0.5;
        }else if (getNumero()==9) {
            return 0.5;
        }else if (getNumero()==10) {
            return 0.5;
        }
        return -1;
    }

}

