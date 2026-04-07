package AntoninoPalazzolo.U2W1D1.entities;

public abstract class MenuItem {
    private String nome;
    private int calorie;
    private double prezzo;

    public MenuItem(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
