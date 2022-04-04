public class BankAccount {
    private double moneyAmount;

    public BankAccount(){
        moneyAmount = 0;
    }
    public double getAmount() {
        return moneyAmount;
    }
    public void put(double amountMoneyToPut){
        if(amountMoneyToPut < 0) return;
        else moneyAmount  = moneyAmount + amountMoneyToPut;
    }
    public void take(double amountMoneyToTake){
        if(amountMoneyToTake > moneyAmount) return;
        else moneyAmount = moneyAmount - amountMoneyToTake;
    }
    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
