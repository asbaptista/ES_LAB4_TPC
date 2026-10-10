package airport;

public class Airline {
    private String name;
    private double profitMarginRate;

    public Airline(String name, double profitMarginRate) {
        this.name = name;
        this.profitMarginRate = profitMarginRate;
    }

    public String getName() {
        return name;
    }

    public double getProfitMarginRate() {
        return profitMarginRate;
    }
}