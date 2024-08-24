public class EqualSplit extends Split {

    public EqualSplit(User user) {
        super(user);
    }

    @Override
    public void calculateAmount(double totalAmount) {
        // Implement logic for equal split
    }
}

public class ExactSplit extends Split {
    public ExactSplit(User user, double amount) {
        super(user);
        setAmount(amount);
    }

    @Override
    public void calculateAmount(double totalAmount) {
        // Exact amount is already set in constructor
    }
}

public class PercentSplit extends Split {
    private double percentage;

    public PercentSplit(User user, double percentage) {
        super(user);
        this.percentage = percentage;
    }

    @Override
    public void calculateAmount(double totalAmount) {
        setAmount(totalAmount * percentage / 100);
    }
}
