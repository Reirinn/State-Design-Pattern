public class SuspendedState implements AccountState{
    public void activateState(Account account){
        System.out.println("Account activated!");
        account.setState(new ActiveState());
    };
    public void suspendState(Account account){
        System.out.println("Account already suspended!");
       
    };
    public void closeState(Account account){
        System.out.println("Account will close!");
        account.setState(new ClosedState());
    };
    
    public void deposit(Double depositAmount, Account account){
        System.out.println("Account suspended cannot deposit!");
        System.out.println("Account Information : " + account);
        
       
    };
    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("Account suspended cannot withdraw!");
        System.out.println("Account Information : " + account);
    };
    

}
