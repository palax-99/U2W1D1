package AntoninoPalazzolo.U2W1D1.entities;

public class Drink extends MenuItem {
    private double litri;
    private double graduazione;

    public Drink(String nome, int calorie, double prezzo, double litri) {
        super(nome, calorie, prezzo);
        this.litri = litri;
    }

    public Drink(String nome, int calorie, double prezzo, double litri, double graduazione) {
        super(nome, calorie, prezzo);
        this.litri = litri;
        this.graduazione = graduazione;
    }

    public double getLitri() {
        return litri;
    }

    public double getGraduazione() {
        return graduazione;
    }

    @Override
    public String toString() {
        if (graduazione > 0) {
            return getNome() + " (" + litri + "l, " + graduazione + "%)";
        } else {
            return getNome() + " (" + litri + "l)";
        }
    }
}
