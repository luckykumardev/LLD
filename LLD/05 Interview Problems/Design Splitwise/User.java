class User{
 private String userId;
 private String name;
 private String phoneNo;
 private String email;
 private List<Expence> expences;
 private List<User, Balance> balances;

public User(String userId, String name, String phoneNo, String email){
 this.userId= userId;
 this.name = name;
 this.phoneNo =  phoneNo;
 this.email = email;
 this.expenses = new ArrayList<>();
 this.balances = new HashMap<>();
}

public String getUserId(){
    return userId;
}

public String getName(){
    return name;
}

public String getPhoneNo(){
    return phoneNo;
}

public String getEmail(){
    return email;
}

public void addExpence(Expence expence){
    expences.add(expence);
}

public void updateBalance(User user, int amount){
    Balance balance = balances.getOrDefault(user, new Balance(0, this, user));
    balance.updateAmount(amount);
    balances.put(user, balance);
}

}