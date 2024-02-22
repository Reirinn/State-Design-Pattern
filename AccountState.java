public  interface AccountState{
    public void activateState(Account account);
    public void suspendState(Account account);
    public void closeState(Account account);
    
    public void deposit(Double depositAmount, Account account);
    public void withdraw(Double withdrawAmount, Account account);
}

