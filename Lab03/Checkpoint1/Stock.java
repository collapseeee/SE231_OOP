public class Stock {
    // Attributes:
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    // Constructors:
    public Stock() {
    }
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Behaviours:
    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
    // Setters:
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice (double currentPrice) {
        this.currentPrice = currentPrice;
    }
    // Getters:
    public double getPreviousClosingPrice() {
        return this.previousClosingPrice;
    }
    public double getCurrentPrice() {
        return this.currentPrice;
    }
}
