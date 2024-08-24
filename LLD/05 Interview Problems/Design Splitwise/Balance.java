public class Balance {
    private double amount;
    private User owedBy;
    private User owedTo;

    public Balance(double amount, User owedBy, User owedTo) {
        this.amount = amount;
        this.owedBy = owedBy;
        this.owedTo = owedTo;
    }

    public double getAmount() {
        return amount;
    }

    public void updateAmount(double amount) {
        this.amount += amount;
    }

    public User getOwedBy() {
        return owedBy;
    }

    public User getOwedTo() {
        return owedTo;
    }
}