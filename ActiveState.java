public class ActiveState implements AccountState{

    public void closeState(Account account){
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }

    public void suspendState(Account account){
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
    }
}