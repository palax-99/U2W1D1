package AntoninoPalazzolo.U2W1D1.entities;

public class Tavolo {
    private int numeroTavolo;
    private int copertiMassimo;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int copertiMassimo, StatoTavolo statoTavolo) {
        this.numeroTavolo = numeroTavolo;
        this.copertiMassimo = copertiMassimo;
        this.statoTavolo = statoTavolo;
    }

    public int getNumeroTavoli() {
        return numeroTavolo;
    }

    public int getCopertiMassimo() {
        return copertiMassimo;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavoli=" + numeroTavolo +
                ", copertiMassimo=" + copertiMassimo +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
