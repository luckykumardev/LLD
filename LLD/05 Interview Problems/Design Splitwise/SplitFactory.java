public class SplitFactory {
    public static Split createSplit(String type, User user, double amount) {
        switch (type) {
            case "EXACT":
                return new ExactSplit(user, amount);
            case "PERCENT":
                return new PercentSplit(user, amount);
            case "EQUAL":
            default:
                return new EqualSplit(user);
        }
    }
}
