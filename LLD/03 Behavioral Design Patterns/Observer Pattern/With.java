import java.util.ArrayList;
import java.util.List;

// Observer Interface    ----> OBSERVER
interface Investor {
    void update(String stockSymbol, double stockPrice);
}

// Subject Interface     ----> OBSERVERABLE
interface StockSubject {
    void registerInvestor(Investor investor);
    void removeInvestor(Investor investor);
    void notifyInvestors();
}

// Stock Ticker with Observer Pattern
class StockTicker implements StockSubject {
    private List<Investor> investors;
    private String stockSymbol;
    private double stockPrice;

    public StockTicker() {
        investors = new ArrayList<>();
    }

    public void setPrice(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        notifyInvestors();
    }
    
    @Override
    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockSymbol, stockPrice);
        }
    }
}

// Investor A Class
class InvestorA implements Investor {
    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Investor A: " + stockSymbol + " is now $" + stockPrice);
    }
}

// Investor B Class
class InvestorB implements Investor {
    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Investor B: " + stockSymbol + " is now $" + stockPrice);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        StockTicker stockTicker = new StockTicker();
        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        // Register investors
        stockTicker.registerInvestor(investorA);
        stockTicker.registerInvestor(investorB);

        // Set stock prices
        stockTicker.setPrice("AAPL", 150.00);
        stockTicker.setPrice("GOOG", 2800.00);
    }
}
