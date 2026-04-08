package AntoninoPalazzolo.U2W1D1.entities;

import java.time.LocalTime;
import java.util.List;

public class Ordine {
    private List<MenuItem> menuItemList;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int coperti;
    private LocalTime oraAcquisizione;
    private double totale;

    public Ordine(List<MenuItem> menuItemList, int numeroOrdine, int coperti, StatoOrdine statoOrdine, LocalTime oraAcquisizione) {
        this.menuItemList = menuItemList;
        this.numeroOrdine = numeroOrdine;
        this.coperti = coperti;
        this.statoOrdine = statoOrdine;
        this.oraAcquisizione = oraAcquisizione;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public int getCoperti() {
        return coperti;
    }

    public LocalTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public double getTotale() {
        return totale;
    }

    public double calcolaTotale() {
        double somma = 0;
        for (MenuItem item : menuItemList) {
            somma += item.getPrezzo();
        }
        this.totale = somma;
        return somma;
    }

    @Override
    public String toString() {
        return "=== ORDINE #" + numeroOrdine + " ===" +
                "\nStato: " + statoOrdine +
                "\nCoperti: " + coperti +
                "\nOra acquisizione: " + oraAcquisizione +
                "\nElementi: " + menuItemList +
                "\nTotale: " + totale + "€";
    }
}
