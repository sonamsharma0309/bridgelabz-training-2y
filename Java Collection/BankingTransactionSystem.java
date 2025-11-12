import java.util.*;
public class BankingTransactionSystem {
    static class Transaction{ String id; double amount; Transaction(String id,double a){this.id=id;this.amount=a;} public String toString(){return id+":"+amount;} }
    static class Account{ String id; Account(String id){this.id=id;} public int hashCode(){return id.hashCode();} public boolean equals(Object o){return o instanceof Account && ((Account)o).id.equals(id);} }
    public static void main(String[] args){
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Set<Account> validAccounts = new HashSet<>();
        Stack<Transaction> rollback = new Stack<>();
        Account a1 = new Account("A1"); validAccounts.add(a1);
        Transaction t1 = new Transaction("T1",100);
        pending.add(t1);
        while(!pending.isEmpty()){
            Transaction t = pending.poll();
            // validate (simple)
            if(validAccounts.contains(a1)){
                System.out.println("Executing " + t);
                all.add(t);
                rollback.push(t);
            } else {
                System.out.println("Invalid account for " + t);
            }
        }
        // rollback last
        if(!rollback.isEmpty()){
            Transaction last = rollback.pop();
            System.out.println("Rolled back " + last);
        }
    }
}
