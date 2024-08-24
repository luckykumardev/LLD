import java.util.*;

public class ExpenseService {
    private static ExpenseService instance = null;
    private List<Expense> expenses;
    private Map<User, Map<User, Balance>> balances;

    private ExpenseService() {
        expenses = new ArrayList<>();
        balances = new HashMap<>();
    }

    public static ExpenseService getInstance() {
        if (instance == null) {
            instance = new ExpenseService();
        }
        return instance;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void settleUp(User user1, User user2) {
        // Logic to settle up balances between user1 and user2
    }

    public Map<User, Map<User, Balance>> getBalances() {
        return balances;
    }

    // Other methods to get and manage expenses and balances...
}
