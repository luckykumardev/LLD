public class PricingService {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double getFare(Ride ride) {
        return pricingStrategy.calculateFare(ride);
    }
}