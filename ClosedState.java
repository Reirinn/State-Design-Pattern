public class CloseState implements AccountState{
    
    public void closeState(Account account){
        System.out.println("You cannot activate a closed account!");
        account.setState(new CloseState());
    }

}
