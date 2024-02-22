public class SuspendedState implements AccountState{
   
    public void activateState(Account account){
        System.out.println("Account is active!");
        account.setState(new ActiveState());
   }

   public void closeState(Account account){
    System.out.println("Account is closed!");
    account.setState(new CloseState());
}

}