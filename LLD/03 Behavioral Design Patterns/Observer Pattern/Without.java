// Stock Ticker without Observer Pattern
class StockTicker {
    private String stockSymbol;
    private double stockPrice;

    public void setPrice(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        updateInvestors();
    }

    private void updateInvestors() {
        // Directly updating investors (tight coupling)
        System.out.println("Notifying Investor A: " + stockSymbol + " is now $" + stockPrice);
        System.out.println("Notifying Investor B: " + stockSymbol + " is now $" + stockPrice);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        StockTicker stockTicker = new StockTicker();
        stockTicker.setPrice("AAPL", 150.00);
        stockTicker.setPrice("GOOG", 2800.00);
    }
}
