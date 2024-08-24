import java.util.*;

public class Group {

    private String groupId;   
    private String groupName;
    private List<User> groupMembers;
    private List<Expence> expences;

    // [TODO] getters of groupId, groupName, users and expences

    public void addmembers(User user){
        groupMembers.add(user);
    }

    public void addExpence(Expence expence){
        expences.add(expence);
    }
    

}