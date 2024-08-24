import java.util.*;

public class Expense {

    private String expenceId;
    private User paidBy;
    private int amt;
    private Group group;
    private List<Split> splits;

    public void Expence(String expenceId, User paidBy, int amt, Group group, List<Split> splits){
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
        this.group = group;

        for (Split split : splits) {
            split.getUser().updateBalance(paidBy, split.getAmount());
        }
    }


    // getters of 
}