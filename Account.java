public class Account {
    private String accountNum;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNum, Double balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }
}