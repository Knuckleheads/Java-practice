public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        CardAccount account1 = new CardAccount();
        account.setMoneyAmount(10000);
        account.put(5000);
        account.take(10000);
        account1.setMoneyAmount(10000);
        account1.put(5000);
        account1.take(10000);
        System.out.println(account.getAmount());
        System.out.println(account1.getAmount());
    }
}
